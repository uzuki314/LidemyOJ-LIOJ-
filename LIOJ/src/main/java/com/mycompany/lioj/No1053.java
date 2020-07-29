package com.mycompany.lioj;
import java.io.*;
import java.util.*;
 
public class No1053 {
    static class element{
        int [] cord;
        int dist;
    }
     
    static char [][] dungeon;
    static int L,R;
    static int solve(int [] st, int[] end){
        HashSet<String> v = new HashSet<String>();
        Queue<element> q = new LinkedList<element>();
        element s = new element();
        s.cord = st;
        s.dist = 0;
        q.add(s);
        v.add(Arrays.toString(st));
        String endd = Arrays.toString(end);
        while(!q.isEmpty()){
            element curr = q.poll();
            int [] cord = curr.cord;
            if(endd.equals(Arrays.toString(curr.cord)))
                return curr.dist;
            for (int i = 0; i < 2; i++) {
                int [] a1 = new int[2];
                int [] a2 = new int[2]; 
                for (int j = 0; j < 2; j++) {
                    if(i == j){
                        if(cord[j] > 0)
                            a1[j] = cord[j] -1;
                        if((i == 0 && cord[j] < L - 1) || (i == 1 && cord[j] < R - 1))
                            a2[j] = cord[j] +1;
                    }else
                        a1[j] = a2[j] = cord[j];
                }
                String s1 = Arrays.toString(a1);
                String s2 = Arrays.toString(a2);
                if(!v.contains(s1) && dungeon[a1[0]][a1[1]] != '#'){
                    v.add(s1);
                    element e = new element();
                    e.cord = a1;
                    e.dist = curr.dist + 1;
                    q.add(e);
                }
                if(!v.contains(s2) && dungeon[a2[0]][a2[1]] != '#'){
                    v.add(s2);
                    element e = new element();
                    e.cord = a2;
                    e.dist = curr.dist + 1;
                    q.add(e);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        String[] sp = br.readLine().split(" ");
        L = Integer.parseInt(sp[0]);
        R = Integer.parseInt(sp[1]);
        int[] st = {0,0},end = {L-1,R-1};
        dungeon = new char [L][R];
        for (int i = 0; i < L; i++) {
            dungeon[i] = br.readLine().toCharArray();
        }
        int res = solve(st, end);
        out.append(res);
        System.out.print(out);
    }
}
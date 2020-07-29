package com.mycompany.lioj;
import java.io.*;
public class No1019 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        String[] tmp = in.readLine().split(" ");
        int W = Integer.parseInt(tmp[0]);
        int H = Integer.parseInt(tmp[1]);
//        out.println(W+" "+H);
        String[] Map = new String[H];
        for (int i = 0; i < Map.length; i++) {
            Map[i] = in.readLine();
        }
        in.close();
        
        int[] current = {0,0},end = {Map.length-1,Map[0].length()-1};
        int step = 0;
        int mode = 0;// 0右 1下 2左 3上
        while (true) {
            if (current[0]==end[0]&&current[1]==end[1]) {
                break;
            }             
            if (mode!=2&&(current[1]+1)<Map[0].length()) { //往右
                if (Map[current[0]].charAt(current[1]+1)=='.') {
                    mode = 0;
                    step++;
                    current[1]++;
                    continue;
                }
            }
            if (mode!=3&&(current[0]+1)<Map.length) { //往下
                if (Map[current[0]+1].charAt(current[1])=='.') {
                    mode = 1;
                    step++;
                    current[0]++;
                    continue;
                }
            }
            if (mode!=0&&(current[1]-1)>=0) { //往左
                if (Map[current[0]].charAt(current[1]-1)=='.') {
                    mode = 2;
                    step++;
                    current[1]--;
                    continue;
                }
            }
            if (mode!=1&&(current[0]-1)>=0) { //往上
                if (Map[current[0]-1].charAt(current[1])=='.') {
                    mode = 3;
                    step++;
                    current[0]--;
                    continue;
                }
            }
        }
        out.println(step); 
        out.flush();
    }
}
//6 5
//....##
//###.##
//#...##
//#.####
//#.....
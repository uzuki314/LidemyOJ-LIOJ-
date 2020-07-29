package com.mycompany.lioj;
import java.io.*;
public class No1006 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static int[][] seat;
    public static int n;
    public static int[] occupied;
    public static int count = 0;
    public static void main(String[] args) throws IOException{
        n = inputN()/2;
        seat = new int[2][n];
        occupied = new int[inputN()];
        for (int i = 0; i < occupied.length; i++) {
            occupied[i] = inputN();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                int tmp = i*2+1+j;
                if (hasOccupied(tmp)) {
                    seat[j][i] = 0;
                    continue;
                }
                seat[j][i] = tmp;
            }
        }
        travelMap();
        out.print(count);
        out.flush();
    }
    
    
    public static boolean hasOccupied(int x){
        for (int i = 0; i < occupied.length; i++) {
            if (x==occupied[i]) {
                return true;
            }
        }
        return false;
    }

    public static void travelMap() {
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < 2; j++) {
                if (seat[j][i]==0) {
                    continue;
                }
                if (j==0&&seat[j+1][i]!=0) {
                    count++;
                }
                if (i!=n-1 &&seat[j][i+1]!=0) {
                    count++;
                }
            }
        }        
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}

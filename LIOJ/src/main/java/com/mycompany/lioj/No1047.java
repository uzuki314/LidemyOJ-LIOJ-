package com.mycompany.lioj;
import java.io.*;
public class No1047 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int[] Data = new int[inputN()];
        int m = inputN();
        for (int i = 0; i < Data.length; i++) {
            Data[i] = inputN();
        }
        for (int i = 0; i < m; i++) {
            boolean flag = true;
            int target = inputN();
            for (int j = 0; j < Data.length; j++) {
                if (Data[j]==target) {
                    flag=false;
                    out.println(j);
                    break;
                }
            }
            if (flag) {
                out.println(-1);
            }
        }
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}
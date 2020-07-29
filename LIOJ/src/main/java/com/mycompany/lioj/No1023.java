package com.mycompany.lioj;
import java.io.*;
public class No1023 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = inputN();
        for (int i = n*-1; i <0; i++) {
            int ra_i = n-Math.abs(i);
            boolean flag = true;
            for (int j = n*-1+1; j < n; j++) {
                int ra_j = n-Math.abs(j); 
                if (ra_i+ra_j >= n) {
                    out.print("*");
                    flag = false;
                    continue;
                }
                if (flag) {
                    out.print(" ");
                }
            }
            out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                out.print(" ");
            }
            out.println("|");
        }
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}
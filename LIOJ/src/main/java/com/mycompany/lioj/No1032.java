package com.mycompany.lioj;
import java.io.*;
public class No1032 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = inputN();
        for (int i = 0; i < n; i++) {
            int[] a = {inputN(),inputN()};
            int[] b = {inputN(),inputN()};
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += Math.pow(a[j]-b[j], 2);
            }
            out.printf("%.2f",Math.round(Math.sqrt(sum) * 100.0) / 100.0);
            out.println();
        }
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}

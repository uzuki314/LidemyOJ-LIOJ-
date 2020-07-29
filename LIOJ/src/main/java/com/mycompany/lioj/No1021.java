package com.mycompany.lioj;
import java.io.*;
public class No1021 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = inputN();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                out.print("*");
            }
            out.println();
        }
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}

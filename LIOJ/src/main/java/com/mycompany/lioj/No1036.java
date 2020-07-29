package com.mycompany.lioj;

import java.io.*;

public class No1036 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int[] Data = new int[inputN()];
        for (int i = 0; i < Data.length; i++) {
            Data[i] = inputN();
        }
        for (int i = Data.length-1; i >= 0; i--) {
            out.println(Data[i]);
        }
        out.flush();
    }
    public static int inputN() throws IOException{
        return (int)Integer.parseInt(in.readLine());
    }
}

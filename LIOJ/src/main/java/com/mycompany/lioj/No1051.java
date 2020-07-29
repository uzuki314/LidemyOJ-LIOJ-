package com.mycompany.lioj;
import java.io.*;
public class No1051 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int[] Data = new int[inputN()];
        int count = 0;
        for (int i = 0; i < Data.length; i++) {
            Data[i] = inputN();
        }
        for (int i = 0; i < Data.length-1; i++) {
            for (int j = i+1; j < Data.length; j++) {
                if (Data[i]>Data[j]) {
                    count++;
                }
            }
        }
        out.print(count);
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}
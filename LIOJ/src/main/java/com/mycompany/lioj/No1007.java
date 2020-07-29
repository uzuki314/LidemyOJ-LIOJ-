package com.mycompany.lioj;
import java.io.*;
public class No1007 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = inputN();
        String[] name = new String[n];
        int[] score = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            name[i] = inputS();
            score[i] = inputN();
            if (score[i]>max) {
                max = score[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (score[i]==max) {
                out.println(name[i]);
            }
        }
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
    public static String inputS() throws IOException{
        in.nextToken();
        return in.sval;
    }
}

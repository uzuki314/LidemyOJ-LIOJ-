package com.mycompany.lioj;
import java.io.*;
public class No1049 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int[] X = new int[inputN()];
        int[] Y = new int[inputN()];
        int min = 2147483647;
        for (int i = 0; i < X.length; i++) {
            X[i] = inputN();
        }
        for (int i = 0; i < Y.length; i++) {
            Y[i] = inputN();
        }
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < Y.length; j++) {
                if ( Math.abs(X[i]-Y[j]) < min ) {
                    min = Math.abs(X[i]-Y[j]);
                }
            }
        }
        out.print(min);
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}
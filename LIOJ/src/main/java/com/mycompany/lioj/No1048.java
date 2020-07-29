package com.mycompany.lioj;
import java.io.*;
public class No1048 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int[] Data = new int[inputN()];
        int max = -10000;
        for (int i = 0; i < Data.length; i++) {
            Data[i] = inputN();
        }
        int sum = Data[0];
        if (sum>max) {
            max = sum;
        }
        for (int i = 0; i < Data.length-1; i++) {
            sum = Data[i];
            if (sum>max) {
                max = sum;
            }
            for (int j = i+1; j < Data.length; j++) {
                sum+=Data[j];
                if (sum>max) {
                    max = sum;
                }
            }
        }
        if (Data.length>1) {
            sum = Data[Data.length-1];
            if (sum>max) {
                max = sum;
            }
        }
        out.print(max);
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}
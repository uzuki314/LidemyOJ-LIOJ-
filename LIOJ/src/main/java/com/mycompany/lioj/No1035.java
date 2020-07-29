package com.mycompany.lioj;
import java.io.*;
public class No1035 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int[] Data = new int[100];
        in.nextToken();
        int n = (int)in.nval;
        for (int i = 0; i < n; i++) {
            in.nextToken();
            Data[(int)in.nval-1]++;
        }
        for (int i = 0; i < 100; i++) {
            for (;Data[i]>0;Data[i]--) {
                out.println(i+1);
            }
        }
        out.flush();
    }
}

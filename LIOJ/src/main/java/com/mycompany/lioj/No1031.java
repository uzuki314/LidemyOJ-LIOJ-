package com.mycompany.lioj;
import java.io.*;
public class No1031 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = inputN();
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            sum+=i*i;
        }
        out.println(sum);
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}

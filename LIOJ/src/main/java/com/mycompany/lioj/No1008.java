package com.mycompany.lioj;
import java.io.*;
public class No1008 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = inputN();
        int count = 0;
        while (true) {
            n -=(int) Math.pow(2,(int)(Math.log(n) / Math.log(2)));
            count++;
            if (n==0) {
                break;
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

package com.mycompany.lioj;
import java.io.*;
public class No1002 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        while (true) {
            int a = inputN();
            int b = inputN();
            if (a==0&&b==0) {
                break;
            }
            out.println(a>b?a:b);
        }
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}

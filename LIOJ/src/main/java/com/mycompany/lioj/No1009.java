package com.mycompany.lioj;
import java.io.*;
public class No1009 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        StringBuffer target = new StringBuffer(in.readLine());
        target.reverse();
        out.println(target);
        out.flush();
    }
}

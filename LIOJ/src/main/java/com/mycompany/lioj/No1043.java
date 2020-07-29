package com.mycompany.lioj;
import java.io.*;
public class No1043 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        String target = in.readLine();
        out.println(target.endsWith(in.readLine()));
        out.flush();
    }
}
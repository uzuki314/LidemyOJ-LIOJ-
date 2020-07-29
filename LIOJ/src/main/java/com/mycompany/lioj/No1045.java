package com.mycompany.lioj;
import java.io.*;
public class No1045 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        String target = in.readLine();
        int start = Integer.parseInt(in.readLine());
        int end = Integer.parseInt(in.readLine());
        for (int i = start; i < end; i++) {
            out.print(target.charAt(i));
        }
        out.flush();
    }
}
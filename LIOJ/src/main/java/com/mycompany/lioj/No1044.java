package com.mycompany.lioj;
import java.io.*;
public class No1044 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        String target = in.readLine();
        int targetL = Integer.parseInt(in.readLine());
        targetL = targetL>target.length()?targetL:target.length();
        String str = in.readLine();
        for (int i = 0; i < targetL/str.length()+1; i++) {
            target = target.concat(str);
        }
        for (int i = 0; i < targetL; i++) {
            out.print(target.charAt(i));
        }
        out.flush();
    }
}
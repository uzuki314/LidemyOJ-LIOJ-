package com.mycompany.lioj;
import java.io.*;
public class No1042 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        String target = in.readLine();
        char Upper = 'A';
        char Lower = 'a';
        for (int i = 0; i < 26; i++) {
            target = target.replaceAll(Character.toString(Upper), Character.toString(Lower));
            Upper++;
            Lower++;
        }
        out.println(target);
        out.flush();
    }
}
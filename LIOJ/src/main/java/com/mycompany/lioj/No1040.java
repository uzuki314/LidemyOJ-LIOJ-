package com.mycompany.lioj;
import java.io.*;
public class No1040 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        String target = in.readLine();
        int n = inputN();
        String Data = "";
        for (int i = 0; i < n; i++) {
            Data = Data.concat(in.readLine());
            if (i!=n-1) {
                Data = Data.concat(target);
            }
        }
        out.println(Data);
        out.flush();
    }
    public static int inputN() throws IOException{
        return (int)Integer.parseInt(in.readLine());
    }
}
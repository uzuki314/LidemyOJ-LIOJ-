package com.mycompany.lioj;
import java.io.*;
public class No1034 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = inputN()%26;
        char[] Data = inputS().toCharArray();
        for (int i = 0; i < Data.length; i++) {
            Data[i]+=n;
            if (Data[i]>122) {
                Data[i]-=26;
            }
        }
        out.print(Data);
        out.flush();
    }
    public static int inputN() throws IOException{
        return (int)Integer.parseInt(in.readLine());
    }
    public static String inputS() throws IOException{
        return in.readLine();
    }
}
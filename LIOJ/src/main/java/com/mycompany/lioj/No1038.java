package com.mycompany.lioj;
import java.io.*;
import java.util.*;
public class No1038 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int target = inputN();
        int n = inputN();
        int index = -1;
        for (int i = 0; i < n; i++) {
            int tmp = inputN();
            if (tmp == target) {
                index = i;
                break;
            }
        }
        out.println(index);
        out.flush();
    }
    public static int inputN() throws IOException{
        return (int)Integer.parseInt(in.readLine());
    }
}
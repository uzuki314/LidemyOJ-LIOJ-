package com.mycompany.lioj;
import java.io.*;
import java.util.*;
public class No1037 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int target = inputN();
        int n = inputN();
        List<Integer> Data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = inputN();
            if (tmp == target) continue;
            Data.add(tmp);
        }
        for (int i = 0; i < Data.size(); i++) {
            out.println(Data.get(i));
        }
        out.flush();
    }
    public static int inputN() throws IOException{
        return (int)Integer.parseInt(in.readLine());
    }
}
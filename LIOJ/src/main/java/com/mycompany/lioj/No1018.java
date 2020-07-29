package com.mycompany.lioj;
import java.io.*;
public class No1018 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static int[] platform = new int[1000];
    public static void main(String[] args) throws IOException{
        out.flush();
        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        for (String string : input) {
            platform[Integer.parseInt(string)-1]++;
        }
        int Max = 0;
        for (int i = 0; i < 1000; i++) {
            if (platform[i]>Max) {
                Max = platform[i];
            }
        }
        out.print(Max);
        out.flush();
    }

}

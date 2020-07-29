package com.mycompany.lioj;
import java.io.*;
public class No1011 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = inputN();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=inputN();
        }
        out.print( (sum/n<183)?"fake":"real" );
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}

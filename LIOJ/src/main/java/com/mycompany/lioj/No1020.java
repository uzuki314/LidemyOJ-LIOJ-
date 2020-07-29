package com.mycompany.lioj;
import java.io.*;
public class No1020 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = inputN();
        for (int i = 0; i < n; i++) {
            out.println(isPrime(inputN())?"Prime":"Composite");
        }
        out.flush();
    }
    public static boolean isPrime(int x){
        if (x==0||x==1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x%i==0) {
                return false;
            }
        }
        return true;
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}

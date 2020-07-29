package com.mycompany.lioj;
import java.io.*;
public class No1005 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        while (true) {
            int n = (int)inputN();
            if (n==0) {
                break;
            }
            int sum = 1;
            for (int i = 2; i <= n/2; i++) {
                if (n%i==0) {
                    sum+=i;
                }
            }
            int tmp = 1;
            for (int i = 2; i <= sum/2; i++) {
                if (sum%i==0) {
                    tmp+=i;
                }
            }
            if (tmp==n) {
                out.println(sum);
                continue;
            }
            out.println("QQ");
        }
        out.flush();
    }
    public static double inputN() throws IOException{
        in.nextToken();
        return in.nval;
    }
}

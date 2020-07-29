package com.mycompany.lioj;
import java.io.*;
public class No1028 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(in.readLine().replaceAll(" ",""));
        while (true) {
            if (n == n%10) break;
            n = trans(n);
        }
        out.println(n);
        out.flush();
    }
    public static int trans(int x){
        int tmp = 0;
        while (true) {
            if (x == 0) break;
            tmp+=x%10;
            x/=10;
        }
        return tmp;
    }
}

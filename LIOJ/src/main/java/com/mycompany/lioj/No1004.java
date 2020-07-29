package com.mycompany.lioj;
import java.io.*;
import java.math.*;
public class No1004 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            String[] readBuf = in.readLine().split(" ");
            BigInteger a = new BigInteger(readBuf[0]);
            BigInteger b = new BigInteger(readBuf[1]);
            int k = Integer.parseInt(readBuf[2])*a.compareTo(b);
            
            switch (k) {
                case 0:
                    out.println("DRAW");
                    break;
                case 1:
                    out.println("A");
                    break;
                case -1:
                    out.println("B");
                    break;
            }
        }
        out.flush();
    }
}

package com.mycompany.lioj;
import java.io.*;
public class No1014 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int result = 0;
        int target = inputN();
        int token = 1;
        while (true) {
            result+=target%10*token;
            target/=10;
            if (target==0) {
                break;
            }
            token*=9;
        }
        out.print(result);
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}

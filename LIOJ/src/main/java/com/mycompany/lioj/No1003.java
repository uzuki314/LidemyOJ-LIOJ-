package com.mycompany.lioj;
import java.io.*;
import java.util.Scanner;
public class No1003 {
//    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
//        in.nextToken();
//        int n = (int)in.nval;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String inData = "";
        for (int i = 0; i < n; i++) {
//            in.nextToken();
//            inData = inData.concat(in.sval);
            inData = inData.concat(scanner.next());
        }
//        in.nextToken();
//        n = (int)in.nval;
        n = scanner.nextInt();
        String Result = "";
        for (int i = 0; i < n; i++) {
//            in.nextToken();
//            Result = Result.concat(Character.toString(inData.charAt((int)in.nval-1)));
            Result = Result.concat(Character.toString(inData.charAt((int)scanner.nextInt()-1)));
        }
        out.println(Result);
        out.flush();
    }
}

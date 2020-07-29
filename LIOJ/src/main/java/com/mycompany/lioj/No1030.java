package com.mycompany.lioj;
import java.io.*;
public class No1030 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        StringBuffer inData = new StringBuffer(in.readLine());
        String Data = inData.toString();
        String rData = inData.reverse().toString();
        out.println( (Data.compareTo(rData)==0) ? "True":"False");
        out.flush();
    }
}

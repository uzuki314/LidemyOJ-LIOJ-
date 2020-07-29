package com.mycompany.lioj;
import java.io.*;
public class No1029 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        String[] Data = in.readLine().split(" ");
        switch (Data[1].charAt(0)) {
            case '+':
                out.println(Integer.parseInt(Data[0])+Integer.parseInt(Data[2]));
                break;
            case '-':
                out.println(Integer.parseInt(Data[0])-Integer.parseInt(Data[2]));
                break;
            case '*':
                out.println(Integer.parseInt(Data[0])*Integer.parseInt(Data[2]));
                break;    
            case '/':
                out.println(Integer.parseInt(Data[0])/Integer.parseInt(Data[2]));
                break;    
        }
        out.flush();
    }
}
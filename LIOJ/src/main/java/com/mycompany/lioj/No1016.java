package com.mycompany.lioj;
import java.io.*;
import java.util.*;
public class No1016 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        byte n = inputN();
        List<Byte> A = new ArrayList<>();
        List<Byte> B = new ArrayList<>();
        for (byte i = 0; i < n; i++) {
            if (inputS().charAt(0)=='A') {
                A.add(i);
                continue;
            }
            B.add(i);
        }
        byte token = (byte)(A.size()<B.size()?A.size():B.size()*-1);
        if (token == 0||A.size()==B.size()) {
            out.println("PEACE");
        }
        else{
            if (token>0) {
                for (int i = 0; i < token; i++) {
                    out.println(A.get(i)+1);
                }
            }
            else{
                for (int i = 0; i < token*-1; i++) {
                    out.println(B.get(i)+1);
                }
            }
        }
        out.flush();
        
    }
    public static byte inputN() throws IOException{
        in.nextToken();
        return (byte)in.nval;
    }
    public static String inputS() throws IOException{
        in.nextToken();
        return in.sval;
    }
}

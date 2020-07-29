package com.mycompany.lioj;
import java.io.*;
import java.util.*;
public class No1017 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static int[] carry;
    public static void main(String[] args) throws IOException{
        carry = new int[inputN()];
        short n = (short)inputN();
        for (int i = 0; i < n; i++) {
            putIn(inputN());
        }
        out.print(getTotal());
        out.flush();
    }
    public static int getTotal(){
        int tmp = 0;
        for (int i = 0; i < carry.length; i++) {
            tmp+=carry[i];
        }
        return tmp;
    }
    public static void putIn(int value){
        for (int i = 0; i < carry.length; i++) {
            if (value>carry[i]) {
                carry[i] = value;
                Arrays.sort(carry);
                break;
            }
        }
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}

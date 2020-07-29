package com.mycompany.lioj;
import java.io.*;
public class No1025 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static int[] Data = {1,2,3,4,5,6,7,8,9,153,370,371,407,1634,8208,9474,54748,92727,93084,548834};
    public static void main(String[] args) throws IOException{
        int start = inputN();
        int end = inputN();
        for (int i = 0; i < Data.length; i++) {
            if (Data[i]>=start&&Data[i]<=end) {
                out.println(Data[i]);
            }
        }
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
}


//public class No1025 {
//    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
//    public static void main(String[] args) throws IOException{
//        int start = inputN();
//        int end = inputN();
//        for (int i = start; i <= end; i++) {
//            if (isNarcissistic(i)) {
//                out.println(i);
//            }
//        }
//        out.flush();
//    }
//    public static boolean isNarcissistic(int x){
//        int Digits = (int)Math.log10(x)+1;
//        int copyx = x;
//        int trans = 0;
//        for (int i = 0; i < Digits; i++) {
//            trans+= Math.pow(copyx%10,Digits);
//            copyx/=10;
//        }
//        if (trans==x) {
//            return true;
//        }
//        return false;
//    }
//    public static int inputN() throws IOException{
//        in.nextToken();
//        return (int)in.nval;
//    }
//}

package com.mycompany.lioj;
import java.io.*;
public class No1026 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(in.readLine());
        String[] inData = in.readLine().split(" ");
        double[] Data = new double[n];
        for (int i = 0; i < n; i++) {
            Data[i] = Double.parseDouble(inData[i]);
        }
        double r = Data[1]/Data[0];
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (Data[i]/Data[i-1]!=r) {
                flag = false;
                break;
            }
        }
        out.println(flag?"Yes":"No");
        out.flush();
    }
}

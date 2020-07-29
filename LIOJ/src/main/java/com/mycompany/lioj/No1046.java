package com.mycompany.lioj;
import java.io.*;
public class No1046 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        String[] Map = {in.readLine(),in.readLine(),in.readLine()};
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            if (Map[i].charAt(0)==Map[i].charAt(1) && Map[i].charAt(1)==Map[i].charAt(2) ) {
                out.print(Map[i].charAt(0));
                flag = true;
                break;
            }
            if (Map[0].charAt(i)==Map[1].charAt(i) && Map[1].charAt(i)==Map[2].charAt(i) ) {
                out.print(Map[0].charAt(i));
                flag = true;
                break;
            }
        }
        if (flag) {
            out.flush();
        }
        else{
            if (Map[0].charAt(0)==Map[1].charAt(1) && Map[1].charAt(1)==Map[2].charAt(2)){
                out.print(Map[1].charAt(1));
                out.flush();
            }
            else if (Map[0].charAt(2)==Map[1].charAt(1) && Map[1].charAt(1)==Map[2].charAt(0)){
                out.print(Map[1].charAt(1));
                out.flush();
            }
            else {
                out.print("DRAW");
                out.flush();
            }
        }
    }
}
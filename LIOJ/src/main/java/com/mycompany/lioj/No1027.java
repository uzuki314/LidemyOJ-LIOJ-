package com.mycompany.lioj;
import java.io.*;
public class No1027 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        char[] Data = in.readLine().replaceAll("-", "").toCharArray();
        byte[] code = new byte[16];
        for (int i = 0; i < 16; i++) {
            code[i] = (byte) (Data[i]-'0');
        }
        int check = 0;
        for (int i = 0; i < 15; i++) {
            if ((i+1)%2==1) {
                int tmp = code[i]*2;
                if (tmp>=10) {
                    tmp-=9;
                }
                check+=tmp;
            }
            else{
                check+=code[i];
            }
            //out.println("current : "+check);
        }
        check%=10;
        check = ( (check==0) ? 0 : (10-check) );
        if (check==code[15]) {
            out.println(code[0]==4 ? "VISA" : "MASTER_CARD");
        }
        else out.println("INVALID");
        out.flush();
    }
}

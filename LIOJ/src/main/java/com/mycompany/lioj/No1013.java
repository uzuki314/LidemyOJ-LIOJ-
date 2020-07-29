package com.mycompany.lioj;
import java.io.*;
public class No1013 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static int currentFloor = 1;
    public static int targetFloor;
    public static int count = 0;
    public static void main(String[] args) throws IOException{
        targetFloor = inputN();
        dfs();
        out.print(count);
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }

    public static void dfs() {
        if (currentFloor==targetFloor) {
            count++;
            return;
        }
        currentFloor++;
        dfs();
        currentFloor--;

        currentFloor+=2;
        if (currentFloor<=targetFloor) {
            dfs();
        }
        currentFloor-=2;
        return;
    }
}

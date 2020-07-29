package com.mycompany.lioj;
import java.io.*;
import java.util.*;
public class No1052 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static int limit = 0,currentW=0,currentP=0;
    public static ObjData[] data;
    public static int max = 0;
    public static void main(String[] args) throws IOException{
        
        data = new ObjData[inputN()];
//        data = new ObjData[20];

        limit = inputN();
//        limit = (int)(Math.random()*100);

        for (int i = 0; i < data.length; i++) {
            data[i] = new ObjData(inputN(),inputN());
//            data[i] = new ObjData((int)(Math.random()*100),(int)(Math.random()*10000));
        }
        for (int i = 0; i < data.length; i++) {
            if (isFull(data[i].w)) continue; 
            currentW+=data[i].w;
            currentP+=data[i].p;
            dfs(i);
            currentW-=data[i].w;
            currentP-=data[i].p;
        }
        out.println(max);
        out.flush();
    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }
    public static void dfs(int start) {
        //out.println(getTotalValue());
        if (currentP>max) {
            max = currentP;
        }
        for (int i = start+1; i < data.length; i++) {
            if (!isFull(data[i].w)) {
                currentW+=data[i].w;
                currentP+=data[i].p;
                dfs(i);
                currentW-=data[i].w;
                currentP-=data[i].p;
            }
        }
    }

    public static boolean isFull(int n){
        return ((currentW+n)>limit)?true:false;
    }
}
class ObjData{
    int w;    //重量
    int p;    //價值
    public ObjData(int w,int p){
        this.w = w;
        this.p = p;
    }
}

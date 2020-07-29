package com.mycompany.lioj;
import java.io.*;
public class No1033 {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        int n = inputN();
        int[][] node = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                node[i][j] = inputN();
            }
        }
        //merge_sort(node,1);
        //merge_sort(node,0);
        double min = -1;
        int[] A = null,B = null;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (min ==-1 || min>getDistance(node[i],node[j])) {
                    A = node[i];
                    B = node[j];
                    min = getDistance(node[i],node[j]);
                }
            }
        }
        if (A[0]==B[0]) {
            if (A[1]>B[1]) {
                int[] tmp = A;
                A=B;
                B=tmp;
            }
        }
        else if (A[0]>B[0]) {
            int[] tmp = A;
            A=B;
            B=tmp;
        }
        out.println(A[0]+" "+A[1]);
        out.println(B[0]+" "+B[1]);
        out.flush();
    }
    public static double getDistance(int[] a,int[] b){
        int sum = 0;
        for (int j = 0; j < 2; j++) {
            sum += Math.pow(a[j]-b[j], 2);
        }
        return sum;
    }
//    public static void merge_sort(int[][] arr,int target) {
//        int[][] orderedArr = new int[arr.length][2];
//        for (int i = 2; i < arr.length * 2; i *= 2) {
//            for (int j = 0; j < (arr.length + i - 1) / i; j++) {
//                int left = i * j;
//                int mid = left + i / 2 >= arr.length ? (arr.length - 1) : (left + i / 2);
//                int right = i * (j + 1) - 1 >= arr.length ? (arr.length - 1) : (i * (j + 1) - 1);
//                int start = left, l = left, m = mid;
//                while (l < mid && m <= right) {
//                    if (arr[l][target] <= arr[m][target]) {
//                        orderedArr[start++] = arr[l++];
//                    } else {
//                        orderedArr[start++] = arr[m++];
//                    }
//                }
//                while (l < mid)
//                    orderedArr[start++] = arr[l++];
//                while (m <= right)
//                    orderedArr[start++] = arr[m++];
//                System.arraycopy(orderedArr, left, arr, left, right - left + 1);
//            }
//        }
//    }
    public static int inputN() throws IOException{
        in.nextToken();
        return (int)in.nval;
    }

}

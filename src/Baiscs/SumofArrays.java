package Baiscs;

import java.util.Scanner;

public class SumofArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = s.nextInt();
        }
        int m = s.nextInt();
        int B[] = new int[m];
        for(int i=0;i<m;i++){
            B[i] = s.nextInt();
        }

    }
}

package Baiscs;

import java.util.Scanner;

public class Indices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = s.nextInt();
        }
        int m = s.nextInt();
        for(int i=0;i<n;i++){
            if(A[i] == m){
                System.out.printf("%d ",i);
            }
        }
    }
}

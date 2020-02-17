package Baiscs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = s.nextInt();
        }
        int B[] = new int[n];
        for(int i=0;i<n;i++){
            B[i]=A[i];
        }
        Arrays.sort(B);
        for(int i=0;i<n;i++){
            if(A[i]!=B[i]){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}

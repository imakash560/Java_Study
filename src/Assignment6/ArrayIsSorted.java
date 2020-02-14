package Assignment6;

import java.util.Scanner;

public class ArrayIsSorted {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int A[] = new int[N];
    int j=1;
        for(int i=0;i<N;i++) {
            A[i] = s.nextInt();
        }
        arrayissort(A,j);
    }
    public static void arrayissort(int A[],int j){
        if(j == A.length){
            System.out.println("Array is sorted");
            return;
        }
        if(A[j-1]>A[j]){
            System.out.println("Array is not sorted");
            return;
        }
        else{
            arrayissort(A,j+1);
        }
    }
}

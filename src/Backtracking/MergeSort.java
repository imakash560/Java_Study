package Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int N = s.nextInt();
        int A[]=new int[N];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<N;i++){
            A[i] = s.nextInt();
        }
        mergesort(A);
        for(int i=0;i<N;i++){
            System.out.print(A[i]+" ");
        }
    }

    private static int[] mergesort(int[] A) {
        if(A.length==1){
            return A;
        }
        int mid =A.length/2;
        int[] a= Arrays.copyOfRange(A,0,mid);
        mergesort(a);
        int[] b= Arrays.copyOfRange(A,mid,A.length);
        return merge(a,b);

    }
    public static int[] merge(int[] a,int[] b){
        int c[] = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                k++;
                i++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }

        }
        while(i<a.length){
            c[k] = a[i];
            k++;
            i++;
        }
        while (j<b.length){
            c[k] = b[j];
            k++;
            j++;
        }
        return c;
    }


}

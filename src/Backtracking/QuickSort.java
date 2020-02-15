package Backtracking;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int A[] = {4,2,1,5};
        quick(A,0,A.length);
        System.out.println(Arrays.toString(A));

    }
    public static void quick(int ar[],int start,int end){
        if(start>=end){
            return;
        }
        int pivot = end-1;
        pivot = pivotReturn(ar,start,pivot);
        quick(ar,0,pivot);
        quick(ar,pivot+1,end);

    }
    public static int pivotReturn(int ar[],int start,int pivot){
        int j=start;
        for (int i = start; i <pivot ; i++) {
            if (ar[i] < ar[pivot]) {
                int temp = ar[i];
                ar[i] = ar[pivot];
                ar[pivot] = temp;
                j++;
            }
        }
            int temp = ar[pivot];
            ar[pivot] = ar[j];
            ar[j] = temp;
            return j;


    }
}

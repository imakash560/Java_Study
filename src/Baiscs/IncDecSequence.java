package Baiscs;

import java.util.Scanner;

public class IncDecSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = s.nextInt();
        }

        if(incsequence(A,0)){

            System.out.println(true);
        }

        else if(decsequence(A,0)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static boolean incsequence(int A[],int i){
        if(i==A.length-1){
            return true;
        }
        if(A[i]<A[i+1] ){
            incsequence(A, i + 1);
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean decsequence(int A[],int i){
        if(i==A.length-1){
            return true;
        }
        if(A[i]>A[i+1]){
            decsequence(A, i + 1);
            return true;
        }
        else {

            return false;
        }
    }
}

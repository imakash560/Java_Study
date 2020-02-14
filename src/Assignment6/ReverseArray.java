package Assignment6;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = s.nextInt();
        }
        int B[] = new int[n];
        reverse(A,B,0,n-1);
    }
    public static void reverse(int A[],int B[],int start,int n){
        if(start == A.length){
            for(int i=0;i<A.length;i++){
                System.out.println(B[i]);

            }
            return;
        }
        B[start] = A[n];
        reverse(A,B,start+1,n-1);
    }
}

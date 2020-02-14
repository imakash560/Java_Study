package Assignment6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int N = s.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i] = s.nextInt();
        }
        System.out.println(ispalindrome(A,N-1,0));
    }
    public static boolean ispalindrome(int A[],int N,int start){
        if(start>=N){
            return true;
        }
        if(A[start] == A[N]){
            ispalindrome(A,start+1,N-1);
        }
        else{
            return false;
        }
        return true;
    }
}

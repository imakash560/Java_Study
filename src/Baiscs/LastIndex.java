package Baiscs;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        int flag =0;
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        int m = s.nextInt();
        for(int i=A.length-1;i>=0;i--){
            if(A[i] == m){
                System.out.println(i);
                flag = 1;
                return;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
    }
}

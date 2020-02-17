package Baiscs;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

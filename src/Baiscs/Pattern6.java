package Baiscs;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+j+"  ");
            }
            if(i>1){
                for(int k=1;k<=i-1;k++){
                    System.out.print("  "+(i+k-n));
                }
            }
            System.out.println();
        }
    }
}

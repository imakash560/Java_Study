package Baiscs;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <=n ; i++) {
            for(int j=1 ; j<=i;j++){
                if(i == 1){
                    System.out.print("1");
                }
                else if(j>1 && j<i){
                    System.out.print("0");

                }
                else {
                    System.out.print(i - 1);
                }
            }
            System.out.println();

        }
    }
}

package Baiscs;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int v = 1;
        for (int i = 1; i <=n ; i++) {
            int count=1;
            for(int j=i;j<=n;j++){
                System.out.print(count+" ");
                count++;
            }

            if(i>1){
                for(int k=1;k<=v;k++){
                    System.out.print("* ");
                }
                v=v+2;
            }
            System.out.println();

        }
    }
}

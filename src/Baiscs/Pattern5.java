package Baiscs;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       /*int sum=0;
       for(int i=1;i<=n;i++){
           sum+= i;
       }*/

       int A[] = new int[100];
       A[0]=0;
       A[1]=1;
       for(int i=2;i<100;i++){
           A[i] = A[i-1]+A[i-2];
       }
       int k=0;
      for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
              System.out.printf("%d ",A[k]);
              k++;
          }

          System.out.println();
      }

    }

}

package Baiscs;

import java.util.Scanner;

public class PiyushMagicalPark {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        int S = s.nextInt();
        int A[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j] = s.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(S>k) {
                    if (A[i][j] == '.') {
                        S = S - 2;
                    } else if (A[i][j] == '*') {
                        S = S + 5;
                    } else if (A[i][j] == '#') {
                        break;
                    } else {
                        continue;
                    }
                    S--;
                }
            }
        }
        System.out.printf("Yes\n%d",S);
    }

}

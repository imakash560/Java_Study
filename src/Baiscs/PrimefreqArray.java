package Baiscs;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimefreqArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        boolean Ar[] = new boolean[10000 + 1];
        for (int i = 0; i < Ar.length; i++) {
            Ar[i] = true;
        }
        for (int p = 2; p < Ar.length; p++) {
            if (Ar[p]) {
                for (int i = 2; i * p < Ar.length; i++) {
                    Ar[i * p] = false;
                }
            }


        }



        for (int i = 0; i < T; i++) {
            int count = 0;
            int N = s.nextInt();
            for (int j = 2; j < Ar.length; j++) {
                if (Ar[j]) {
                    count++;
                }
                if (count == N) {
                    System.out.println(j);
                    break;
                }

            }
        }


        }
    }


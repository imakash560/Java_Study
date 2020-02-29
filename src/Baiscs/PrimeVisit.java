package Baiscs;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeVisit {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        boolean Ar[] = new boolean[1000000];
        ArrayList<Integer> B = new ArrayList<>();
        Ar[0] = true;
        Ar[1] = true;

        for (int p = 1; p < Ar.length; p++) {
            if (!Ar[p]) {
                for (int i = 2 * p; i < Ar.length; i += p) {
                    Ar[i] = true;

                }
                B.add(p);
            }
        }
            for(int i=0;i<N;i++){
                int r1 = s.nextInt();
                int r2 = s.nextInt();
                int count=0;
                for(int j=0;j<B.size();j++){
                    if(B.get(j) >= r1 && B.get(j)<r2){
                        count++;
                    }
                }
                System.out.println(count);
            }


        }
    }


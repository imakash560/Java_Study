package Baiscs;

import java.util.ArrayList;
import java.util.Scanner;

public class AllTheGates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int k = s.nextInt();
            ArrayList<Character> A = new ArrayList<>();
            for(int j=0;j<n;j++){
                char ch = s.next().charAt(0);
                A.add(ch);
            }


                for (int j = n - 1; j >=n-k; j--) {

                        if (A.get(j) == 'T') {
                            A.remove(j);

                        } else {

                            for (int x = 0; x < j; x++) {
                                if (A.get(x) == 'H') {
                                    A.set(x,'T');
                                } else {
                                    A.set(x,'H');
                                }
                            }
                            A.remove(j);


                        }

                }

            int cnt =0;
            for(int j=0;j<A.size();j++){
                if(A.get(j) == 'H'){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}

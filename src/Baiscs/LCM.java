package Baiscs;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            System.out.println(n1*n2/gcd(n1,n2));
        }
        public static int gcd(int n1,int n2){
            if (n2 != 0)
                return gcd(n2, n1 % n2);
            else
                return n1;
        }
}

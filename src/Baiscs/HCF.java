package Baiscs;

import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=s.nextInt();
        int b = s.nextInt();
        int g = gcd(a,b);
        if(n>2) {
            for (int i = 2; i < n; i++) {
                int c = s.nextInt();
                g = gcd(g, c);
            }
        }
        System.out.println(g);

    }
    public static int gcd(int n1,int n2){
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
}

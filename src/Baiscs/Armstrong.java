package Baiscs;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int n = a;
        int p = Integer.toString(n).length();
        int check=0;
        while(n>0){
            int rem = n%10;
            check = (int)(check + Math.pow(rem,p));
            n=n/10;
        }
        if(check!=a){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }
}

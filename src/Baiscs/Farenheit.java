package Baiscs;

import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();
        for(int i=a;i<=b;i+=20){
            int cel = (i-32)*5/9;
            System.out.println(i+"  "+cel);
        }
    }
}

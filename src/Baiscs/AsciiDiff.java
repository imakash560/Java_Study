package Baiscs;

import java.util.Scanner;

public class AsciiDiff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        for(int i=0;i<str.length();i++){
            if(i+1<str.length()) {
                int a = str.charAt(i) - str.charAt(i + 1);
                System.out.printf("%c%d", str.charAt(i), a);
            }
            else{
                System.out.printf("%c",str.charAt(i));
            }
        }
    }
}

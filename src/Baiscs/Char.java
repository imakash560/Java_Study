package Baiscs;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch =s.next().charAt(0);
        if(ch-'a'>=0 && ch-'a'<26){
            System.out.println("L");
        }
        else if(ch-'A'>=0 && ch-'A'<26){
            System.out.println("U");
        }
        else{
            System.out.println("Invalid");
        }
    }
}

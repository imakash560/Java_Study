package Baiscs;

import java.util.Scanner;

public class CharType {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int ch = s.next().charAt(0);
        if(ch>=97 && ch<=122){
            System.out.println("lowercase");
        }
        else if(ch>=65 && ch<=90){
            System.out.println("UPPERCASE");
        }
        else{
            System.out.println("Invalid");
        }
    }
}

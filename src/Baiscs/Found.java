package Baiscs;

import java.util.Scanner;

public class Found {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char ch = s.next().charAt(0);
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}

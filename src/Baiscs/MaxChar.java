package Baiscs;

import java.util.Scanner;

public class MaxChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int A[] = new int[26];
        for(int i=0;i<str.length();i++){
            A[str.charAt(i) - 'a']++;
        }
        int max = A[0];
        int index = 0;
        for(int i=0;i<26;i++){
            if(A[i]>max){
                max = A[i];
                index = i;
            }
        }
        System.out.printf("%c",'a'+index);
    }
}

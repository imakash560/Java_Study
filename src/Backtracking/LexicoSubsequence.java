package Backtracking;

import java.util.Scanner;

public class LexicoSubsequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            String str = s.next();
            int freq[] = new int[26];
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                freq[ch-'a']++;
            }
            subsequence(0,"",freq);
        }
    }
    public static void subsequence(int length,String pro,int A[]){
        if(length == A.length-1){
            System.out.println(pro);
            return;
        }

    }
}

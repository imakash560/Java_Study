package Baiscs;

import java.util.Scanner;

public class SetBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int count = 0;
            for (int j = a; j <= b; j++) {
                String str = Integer.toBinaryString(j);
                for(int k=0;k<str.length();k++){
                    if(str.charAt(k) == '1'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

}
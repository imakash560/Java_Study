package Baiscs;

import java.util.Scanner;

public class StringCompression1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(i+1!=str.length()) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    cnt++;
                    System.out.printf("%c%d", str.charAt(i), cnt);
                    cnt = 0;
                } else {
                    cnt++;
                }
            }
            else{
                cnt++;
                System.out.printf("%c%d",str.charAt(i),cnt);
            }
        }
    }
}

package Assignment7;

import java.util.Scanner;

public class Q4StringPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(palindrome(str,0,str.length()-1));
    }
    public static boolean palindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){

            return false;
        }
        palindrome(str,start+1,end-1);
        return true;
    }
}

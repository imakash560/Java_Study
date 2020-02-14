package Assignment7;

import java.util.Scanner;

public class IsReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        System.out.println(check(str1,str2,0,str2.length()-1));
    }
    public static boolean check(String str1,String str2,int start,int end){
        if(start == str1.length()){
            return true;
        }
        if(str1.length() != str2.length()){
            return false;
        }
        if(str1.charAt(start) == str2.charAt(end)){
            check(str1,str2,start+1,end-1);
            return true;
        }
        return true;

    }
}

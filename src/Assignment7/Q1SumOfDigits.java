package Assignment7;

import java.util.Scanner;

public class Q1SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        sum(str,0);
    }
    public static void sum(String str,int sum){
        if(str.isEmpty()){
            System.out.println(sum);
            return;
        }
        int ch = str.charAt(0) - '0';
        str = str.substring(1);
        sum(str,sum+ch);
    }
}

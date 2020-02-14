package Assignment7;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str = s.next();
        convertInt(str,0);
    }
    public static void convertInt(String str,int val){
        if(str.isEmpty()){
            System.out.println(val);
            return;
        }
        int ch = str.charAt(0) - '0';
        str = str.substring(1);
        convertInt(str,(val*10)+ch);
    }
}

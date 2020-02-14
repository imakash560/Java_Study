package Assignment7;

import java.util.Scanner;

public class Q7XatEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        putxxatend(str,"","");
    }
    public static void putxxatend(String str,String pro,String end){
        if(str.isEmpty()){
            System.out.println(pro+end);
            return;
        }
        char ch = str.charAt(0);
        str = str.substring(1);
        if(ch == 'x' || ch == 'X'){
            putxxatend(str,pro,end+ch);
            return;
        }
        else {
            putxxatend(str,pro+ch,end);
            return;
        }
    }
}

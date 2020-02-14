package Assignment7;

import java.util.Scanner;

public class Q5Duplicacy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        duplicate(str,"",0);
    }
    public static void duplicate(String str,String pro,int start){
        if(start == str.length()-1){
            char ch = str.charAt(start);
            pro = pro+ch;
            System.out.println(pro);
            return;
        }
        char ch = str.charAt(start);


        if(str.charAt(start) != str.charAt(start+1)){

            duplicate(str,pro+ch,start+1);
            return;
        }
        else{
            duplicate(str,pro+ch+'*',start+1);

            return;
        }

    }
}

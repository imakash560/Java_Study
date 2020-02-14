package Assignment7;

import java.util.Scanner;

public class Q6RemoveDuplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        remove(str,"",0);
    }
    public static void remove(String str,String pro,int start){
        if(start == str.length()-1){
            char ch = str.charAt(start);
            pro = pro+ch;
            System.out.println(pro);
            return;
        }
        char ch = str.charAt(start);
        if(str.charAt(start) == str.charAt(start+1)){
            remove(str,pro,start+1);
            return;
        }
        else{
            remove(str,pro+ch,start+1);
        }
    }
}

package Assignment7;

import java.util.Scanner;

public class Q8HiHi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        hicount(str,0,0);
    }
    public static void hicount(String str,int i,int cnt){
        if(i == str.length()-1){
            System.out.println(cnt);
            return;
        }
        char ch = str.charAt(i);
        char ch2 = str.charAt(i+1);
        if(ch == 'h' && ch2 == 'i'){

            hicount(str,i+1,cnt+1);
            return;
        }
        else{
            hicount(str,i+1,cnt);
            return ;
        }


    }
}

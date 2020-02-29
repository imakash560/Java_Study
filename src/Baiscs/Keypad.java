package Baiscs;

import java.util.Scanner;

public class Keypad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] st = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
        String str = s.next();
        System.out.printf("\n%d",combinations(st,str,""));
    }
    public static int combinations(String[] st,String str,String pro){
        if(str.isEmpty()){
            System.out.printf("%s ",pro);
            return 1;
        }
        int cnt = 0;
        int digit = str.charAt(0) - '0';
        str = str.substring(1);
        for(int i=0;i<st[digit].length();i++){
            char ch = st[digit].charAt(i);
            cnt+= combinations(st,str,pro+ch);
        }
        return cnt;
    }
}

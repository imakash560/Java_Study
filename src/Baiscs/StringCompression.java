package Baiscs;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int A[] = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            A[(ch - 'a')]++;
        }
        compression(str,"",A,0);
        /*for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) != str.charAt(i+1)) {
                char c = (char)('a'+i);
                System.out.print(c);
                System.out.print(A[i]);
            }
        }*/

    }
    public static void compression(String str,String pro,int A[],int i){
        if(i==str.length()-1){
            char ch = str.charAt(i);
            pro=pro+ch+A[ch-'a'];
            System.out.println(pro);
            return;
        }
        if(str.charAt(i)!=str.charAt(i+1)){
            char ch = str.charAt(i);
            compression(str,pro+str.charAt(i)+A[ch-'a'],A,i+1);
        }
        else{
            compression(str,pro,A,i+1);
        }
    }
}

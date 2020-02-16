package Baiscs;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N =s.nextInt();
        for(int i=0;i<N;i++){
           String num = s.next();
            System.out.println(Integer.parseInt(num,2));
        }
    }
}

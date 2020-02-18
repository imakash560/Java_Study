package Baiscs;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int flag =0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag =1;
                break;

            }
        }
        if(flag==1){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}

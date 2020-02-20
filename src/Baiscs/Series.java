package Baiscs;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int sum =1;
        for(int i=0;i<n1;i++){
            if((sum*3+2)%n2==0){
                i=i-1;
                sum++;
            }
            else{
                System.out.println(sum*3+2);
                sum++;
            }
        }
    }
}

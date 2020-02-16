package Baiscs;

import java.util.Scanner;

public class DelhiCar {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int N= s.nextInt();
        for(int i=0;i<N;i++){
            String num = s.next();
            int sumeven=0,sumodd=0;
            for(int j=0;j<num.length();j++){

                if(num.charAt(j)%2==0){
                    sumeven = sumeven+num.charAt(j);
                }
                else{
                    sumodd = sumodd+num.charAt(j);
                }
            }
            if(sumeven%4==0){
                System.out.println("Yes");
            }
            else if(sumodd%3==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

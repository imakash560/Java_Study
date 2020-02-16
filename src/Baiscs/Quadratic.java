package Baiscs;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int D= (b*b)-(4*a*c);
        if(D==0){
            double r1 = -b/2*a;
            System.out.printf("Real and Equal \n %g %g",r1,r1);

        }
        else if(D>0){
            double r1 = (-b+Math.sqrt(D))/2*a;
            double r2 = (-b-Math.sqrt(D))/2*a;
            System.out.printf("Real and Distinct \n %d %g",(int)r1,r2);

        }
        else{
            System.out.println("Imaginary");
        }
    }
}

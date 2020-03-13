package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(hanoi(n,"T1","T3","T2"));
    }
    public static int hanoi(int n,String beg,String aux,String fin){

        if (n==1){
            System.out.println("Move 1th disc from "+beg+" to "+fin);
            return 1;
        }
        int cnt =1;
        cnt+= hanoi(n-1,beg,fin,aux);
        System.out.println("Move " + n + "th disc from " + beg + " to " + fin);
        cnt+= hanoi(n-1,aux,beg,fin);
        return cnt;

    }
}

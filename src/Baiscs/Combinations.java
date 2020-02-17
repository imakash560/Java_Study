package Baiscs;

import java.util.ArrayList;
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T= s.nextInt();
        for(int i=0;i<T;i++){
            String n1=s.next();
            String n2=s.next();
            StringBuilder build = new StringBuilder();
            for(int j=0;j<n1.length();j++){
                if(n1.charAt(j) == n2.charAt(j)){
                    build.insert(j,0);
                }
                else{
                    build.insert(j,1);
                }
            }
            System.out.println(build);

        }
    }
}

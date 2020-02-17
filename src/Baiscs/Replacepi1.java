package Baiscs;

import java.util.Scanner;

public class Replacepi1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i <T ; i++) {
            String str = s.next();
            str = str.replace("pi","3.14");
            System.out.println(str);
        }
    }
}

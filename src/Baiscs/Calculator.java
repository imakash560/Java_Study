package Baiscs;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        do {
            char ch = s.next().charAt(0);
            int a = s.nextInt();
            int b = s.nextInt();
            switch (ch) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;
                case 'x':
                    return;
                case 'X':
                    return;
                default:
                    System.out.println("Invalid operation. Try again.");
            }
        }while(true);
    }
}

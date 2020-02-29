package Baiscs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StrngSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = s.next();
            list.add(str);
        }
        Collections.sort(list);
        for(int i=0;i<n;i++){
            System.out.println(list.get(i));
        }
    }
}

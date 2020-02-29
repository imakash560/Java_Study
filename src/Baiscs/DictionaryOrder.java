package Baiscs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String a = str;
        ArrayList<String> list = new ArrayList<>();
        combinations(str,"",list);
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i).compareTo(a) > 0 ){
                System.out.println(list.get(i));
            }
        }

    }
    public static void combinations(String str,String pro,ArrayList<String> list){
        if(str.isEmpty()){
            list.add(pro);
            return;
        }
        char ch = str.charAt(0);
        str = str.substring(1);
        for(int i=0;i<=pro.length();i++){
            String first = pro.substring(0,i);
            String second = pro.substring(i);
            combinations(str,first+ch+second,list);
        }
    }
}

package Baiscs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SubsequenceLexo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++) {
            String str = s.next();
            ArrayList<String> list = new ArrayList<>();
            subseq("", str, list);
            Collections.sort(list);
            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j));
            }
        }

    }
    public static void subseq(String pro,String unpro,ArrayList<String> list){
        if(unpro.isEmpty()){
            list.add(pro);
            return;
        }
        char ch = unpro.charAt(0);
        unpro = unpro.substring(1);
        subseq(pro+ch,unpro,list);
        subseq(pro,unpro,list);
    }
}

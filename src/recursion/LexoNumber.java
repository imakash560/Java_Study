package recursion;
import java.util.Scanner;

public class LexoNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        lexo(0,n);
    }
    public static void lexo(int pro,int limit){
        if(pro > limit){
            return;
        }
        for(int i=0;i<=9;i++){
            if(pro == 0 && i==0){
                continue;
            }
            int item = pro*10+i;
            if(item<=limit){
                System.out.println(item);
            }
            lexo(item,limit);
        }
    }
}
package recursion;
import java.util.*;

public class Test {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int k=1;
        for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){

                if (j == 1 || j == i) {
                    k = 1;
                } else {
                    k = 0;
                }
                System.out.print(k);



        }
        System.out.println();
    }

}

}

package Assignment6;
import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        oddeven(N);
    }
    public static void oddeven(int N){
        if(N == 0){
            return;
        }
        if(N%2 != 0){
            System.out.println(N);
        }
        oddeven(N-1);
        if(N%2 == 0){
            System.out.println(N);
        }
    }
}

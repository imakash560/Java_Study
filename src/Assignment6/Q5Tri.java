package Assignment6;
import java.util.*;

public class Q5Tri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum=0;
        triangle(N,sum);

    }
    public static void triangle(int N,int sum){
        if(N==0){
            System.out.println(sum);
            return;
        }
        triangle(N-1,sum+N);
    }
}

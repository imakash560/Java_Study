package Assignment6;
import java.util.*;
public class Q7Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i] = s.nextInt();
        }
        int M =s.nextInt();
        int j=0;
        System.out.println(is_search(A,M,j));
    }
    public static Boolean is_search(int A[],int M,int j){
        if(j == A.length){
            return false;
        }
        Boolean result;
        if(A[j] == M){
            return true;
        }
        result = is_search(A,M,j+1);
        return result;

    }
}

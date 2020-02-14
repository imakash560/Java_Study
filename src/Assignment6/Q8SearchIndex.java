package Assignment6;

import java.util.Scanner;

public class Q8SearchIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i] = s.nextInt();
        }
        int M =s.nextInt();
        int j=0;
        System.out.println(issearchindex(A,M,j));
    }
    public static int issearchindex(int A[],int M,int j){

        if(j == A.length){
            return -1;
        }
        int index=0;
        if(A[j] == M){
            index = j;
            return index;
        }
        index =issearchindex(A,M,j+1);
        return index;
    }
}

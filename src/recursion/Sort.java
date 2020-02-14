package recursion;

public class Sort {
    public static void main(String[] args) {
        int i,j=0;
        int A[] = {4,2,6,3,9,7};
        i = (A.length-1);
        bubble_sort(A,i,j=0);
        for(int k=0;k<A.length;k++) {
            System.out.println(A[k]);
        }
    }
    public static void bubble_sort(int A[],int i,int j){
        int swa=0;
        if(i == 0 ){
            return;
        }
        if(i == j){
            bubble_sort(A,i-1,0);
            return;
        }
        if(A[j]>A[j+1]){
            swa = A[j];
            A[j] = A[j+1];
            A[j+1] = swa;

        }
        bubble_sort(A,i,j+1);
    }


}

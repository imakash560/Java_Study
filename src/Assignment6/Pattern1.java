package Assignment6;

public class Pattern1 {
    public static void main(String[] args) {
        int i=0 ,j=5;
        pattern(i,j);
    }
    public static void pattern(int i, int j){
        if(i == 5){
            return;
        }
        if(i == j){
            System.out.println( );
            pattern(i+1,5);
            return;
        }
        else {
            System.out.print("* ");
            pattern(i, j - 1);
        }
    }
}

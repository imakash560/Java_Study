package Assignment6;

public class Pattern2 {
    public static void main(String[] args) {
        int i=1 ,j=0;
        pattern(i,j);
    }
    public static void pattern(int i, int j){
        if(i == 5){
            return;
        }
        if(i == j){
            System.out.println( );
            pattern(i+1,0);
            return;
        }
        else {
            System.out.print("* ");
            pattern(i, j + 1);
        }
    }
}

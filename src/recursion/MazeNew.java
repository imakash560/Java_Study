package recursion;

import java.util.ArrayList;

public class MazeNew {
    public static void main(String[] args) {
        String proc = "";
        int row =3,col=3;
        System.out.println(mazePathcount(proc,row,col));
    }

    public static int mazePathcount(String proc,int row, int col){

        if(row == 1 && col == 1){
            System.out.println(proc);
            return 1;
        }
        int count = 0;

        if(row>1) {
            count+= mazePathcount(proc + "v", row - 1, col);
        }
        if(col>1){
            count+= mazePathcount(proc+"h",row,col-1);
        }
        return count;
    }
}

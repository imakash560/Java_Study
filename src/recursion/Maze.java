package recursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        String proc = "";
        int row =3,col=3;
        mazePath(proc,row,col);
    }

    public static void mazePath(String proc,int row, int col){
        if(row == 1 && col == 1){
            System.out.println(proc);
            return;
        }

        if(row>1){
             mazePath(proc+"v",row-1,col);
        }
        if(col>1){
            mazePath(proc+"h",row,col-1);
        }
    }
}

package Backtracking;

public class FreqArr {
    public static void main(String[] args) {
        String str = "aaabbcccc";

        freq(str);


    }
    public static int[] freq(String str){
        int A[] = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            A[(ch-'a')]++;
        }
        for(int i=0;i<26;i++){
            System.out.print(A[i]);
        }
        return A;
    }
}

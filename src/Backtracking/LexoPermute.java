package Backtracking;

public class LexoPermute {
public static void permutate(String pro,int length,int freq[]){
    if(length==0){
        System.out.println(pro);
        return;
    }
    for(int i=0;i<freq.length;i++){
        if(freq[i]>0){
            freq[i]--;
            permutate(pro+(char)(i+'a'),length-1,freq);
            freq[i]++;
        }
    }
}

    public static void main(String[] args) {
        String pro = "";
        int length =3;
        int freq[] = new int[26];
        for(int i=0;i<3;i++){
            freq[i]++;
        }
        permutate(pro,length,freq);
    }
}

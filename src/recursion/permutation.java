package recursion;

public class permutation {
    public static void main(String[] args) {
        String pro="";
        String unpro="abc";
        permutate(pro,unpro);
    }
    public static void permutate(String pro,String unpro){
        if(unpro.isEmpty()){
            return;

        }
        char ch = unpro.charAt(0);
        unpro = unpro.substring(1);
        for(int i=0;i<=pro.length();i++){
            String first = pro.substring(0,i);
            String second = pro.substring(i);
            permutate(first+ch+second,unpro);
        }
    }
}

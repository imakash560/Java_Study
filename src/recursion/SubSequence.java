package recursion;

public class SubSequence {
    public static void main(String[] args) {
        String unpro = "abc";
        String pro = "";
        subseq(pro,unpro);

    }
    public static void subseq(String pro,String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = unpro.charAt(0);
        unpro = unpro.substring(1);
        subseq(pro+ch,unpro);
        subseq(pro,unpro);
    }
}

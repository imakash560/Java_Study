package recursion;

public class RemoveChar {
    public static void main(String[] args) {
        String unpro = "hihihIhI";
        String pro ="";
        remove(pro,unpro);

    }
    public static void remove(String pro,String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = unpro.charAt(0);
        if(ch == 'i' || ch == 'I'){
            pro = pro;
        }
        else{
            pro = pro+ch;
        }
        unpro = unpro.substring(1);
        remove(pro,unpro);
    }
}

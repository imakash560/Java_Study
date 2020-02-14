package recursion;

public class DiceBuild {
    public static void main(String[] args) {
        String pro = "";
        int target = 4;
        dice(pro,target);
    }
    public static void dice(String pro,int target){
        if(target == 0){
            System.out.println(pro);
            return;
        }

        for(int i=1;i<=target && i<=6 ;i++){
            dice(pro+i,target-i);
        }
    }

}

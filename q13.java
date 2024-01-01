public class q13 {
    public static void main(String[] args) {
        float math=98;
        float english=88;
        float physics=39;

        float total=(math+english+physics)/3;

        if (total>=40 && math>=33 && english>=33 && physics>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }



    }
}

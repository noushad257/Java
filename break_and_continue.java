public class break_and_continue {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            System.out.println(i);
            System.out.println("JAva is great");
            if(i==2){
                System.out.println("Ending the loop");
                //break;
                continue;


            }
        }
    }
}

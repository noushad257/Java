//write a program to find out whether a given integer is present in an array or not
public class q25 {
    public static void main(String[] args) {
        float [] num={2.1f,3.4f,4.6f,5.98f,6.1f};
        float value=2.3f;
        boolean isInarray=false;
        for (float element:num){
           if (value==element){
               isInarray=true;
               break;
           }
        }
        if (isInarray){
            System.out.println("Value present in array");
        }
       else{
            System.out.println("Value not present in array");
      }

    }
}

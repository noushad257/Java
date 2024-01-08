//create an array of 5 floats and calculate their sum

public class q24 {
    public static void main(String[] args) {
        float [] num={2.1f,3.4f,4.6f,5.98f,6.1f};
        float sum=0;
        for (float element:num){
            sum=sum+element;
        }
        System.out.println(sum);
    }
}

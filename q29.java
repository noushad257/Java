//write a java program to find the maximum element in an array
public class q29 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,59,6};
        int max=0;
        for (int element:arr){
            if (element>max){
                max=element;
            }
        }
        System.out.println("The max value is : "+max);
    }
}

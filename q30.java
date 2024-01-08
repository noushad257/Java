//write a java program to find whether an array is sorted or not
public class q30 {
    public static void main(String[] args) {
        boolean isSorted=true;
        int[] arr={1,2,3,4,5,6};

        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("the array is not sorted");
        }
    }
}
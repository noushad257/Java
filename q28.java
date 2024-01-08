//write a java program to reverse an array
public class q28 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int l=0;
        int n= Math.floorDiv(l,2) ;
        int temp;
        for(int i=0;i<n;i++) {
            //swap a[i] and a[i-1-j]
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for (int element:arr){
            System.out.println(element);
        }
     }
}

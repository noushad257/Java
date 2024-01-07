//write a java program to sum first n even numbers using while loop
public class q19 {
    public static void main(String[] args) {
          int sum=0;
          int i=0;
          int n=3;
          while(i<n){
              sum=sum+(2*i);
              i++;
          }

        System.out.print(sum);
    }
}

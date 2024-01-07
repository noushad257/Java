//write a program to find factorial of a given number using loops
//repeat 5 using for loop/while loop
//repeat 1 using for or while loop/for loop
public class q22 {
    public static void main(String[] args) {
       int n=3;
       int fact =1;
//       for(int i=1;i<=n;i++){
//           fact *=i;
//       }
        int i=1;
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.println(fact);

    }
}

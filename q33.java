//write a recursive function to calculate sum of first n natural numbers
public class q33 {
    static int sumRec(int n){
        //base condition
        //sum(n)=sum(n-1)+n
        //sum(3)=3+sum(2)
        //sum(3)=3+2+sum(1)
        //sum(3)=3+2+1
        //sum(3)=6
        if (n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }

    public static void main(String[] args) {
          int c=sumRec(3);
        System.out.println(c);
    }
}

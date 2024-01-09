//write a function to print nth term of fibonacci series using recursion
//0,1,1,2,3,5,8,13,21,34-->fibonacci series
public class q35 {
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {

     int result =fib(7);
        System.out.println(result);
    }
}

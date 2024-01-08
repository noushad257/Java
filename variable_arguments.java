public class variable_arguments {
    //if any argument is must we have to mention  this
    //like static int sum(int x, int ...arr) this way

    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to vararges");
        System.out.println("sum of nothing : "+sum());
        System.out.println("sum of 1 "+sum(1));
        System.out.println("sum of 1,2 is : "+sum(1,2));
        System.out.println("sum of 1,2,3 is : "+sum(1,2,3));
        System.out.println("sum of 1,2,3,4 is "+sum(1,2,3,4));
        System.out.println("sum of 1,2,...5 is : "+sum(1,2,3,4,5));
        System.out.println("sum of 1,2... 6 is : "+sum(1,2,3,4,5,6));
        System.out.println("sum of 1,2.... 7 is : "+sum(1,2,3,4,5,6,7));
        System.out.println("sum of 1,2,.....8 is : "+sum(1,2,3,4,5,6,7,8));
        System.out.println("sum of 1,2,.......9 is :"+sum(1,2,3,4,5,6,7,8,9));

    }
}

public class methods {
    static int logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;

    }



    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c;
       //method invocation using object creation
//        methods obj=new methods();
//        c=obj.logic(a,b);
//if we dont use static method we have to use obj
        c=logic(a,b);

        int a1=10;
        int b1=1;
        int  c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }

}

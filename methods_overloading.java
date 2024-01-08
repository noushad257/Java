public class methods_overloading {
    static void foo(){
        System.out.println("Good morning babe! ");
    }

    static void foo(int a){
        System.out.println("good morning babe "+a+" bye");
    }

    static void foo(int a,int b){
        System.out.println("good morning babe "+a+" bye " + b);
    }


    public static void main(String[] args) {
             foo();
             foo(3000);
             foo(3000, 4000);
             //arguments are actual
    }
}

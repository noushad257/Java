public class increment_decrement {
    public static void main(String[] args) {
        int i=50;
        System.out.println(i++);//first 50 is assigned
        System.out.println(i);//then value will increment
        System.out.println(++i);//first value will increment
        System.out.println(i);//then result will assigned

        int j=11;
        System.out.println(j--);//first 50 is assigned
        System.out.println(j);//then value will decrement
        System.out.println(--j);//first value will decrement
        System.out.println(j);//then result will assigned

       // Quick Quiz
        int y=7;
        int x=++y+8;
        System.out.println(x);
        //quick quiz
        char a='B';
        a++;
        System.out.println(a);

    }
}

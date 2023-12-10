//Associativity of operators in Java

//precedence and associativity
public class operators2 {
    public static void main(String[] args) {
       int a=6*5-34/2;
        /*
        highest  precedence goes to * and /.they are then evaluated on the basis of left to right associativity

30-34/2
30-17
13
        */
       int b=6/5-34*2;

        /*
6/5
34*2
6/5-34*2
        */


        System.out.println(a);
        System.out.println(b);


    }
}

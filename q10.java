import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("v : ");
        float v=sc.nextFloat();

        System.out.println("u : ");
        float u=sc.nextFloat();

        System.out.println("a : ");
        float a=sc.nextFloat();

        System.out.println("s : ");
        float s=sc.nextFloat();

        System.out.println( ((v * v) - ( u * u ))/(2 * a * s));

    }
}

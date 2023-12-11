import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter yout Physics marks : ");
        int physics=scan.nextInt();

        System.out.println("Enter yout Math marks : ");
        int math=scan.nextInt();

        System.out.println("Enter yout Chemistry marks : ");
        int chemistry=scan.nextInt();

        System.out.println("Enter yout English marks : ");
        int english=scan.nextInt();

        float percentage=(physics+chemistry+math+english)/5.0f;
        System.out.println("Percentage : ");
        System.out.println(percentage);

    }
}

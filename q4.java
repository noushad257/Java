//write a java program to convert kilo meters to miles
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        System.out.println("Enter your km value : ");
        Scanner sc=new Scanner(System.in);
        double km=sc.nextFloat();
        double mile=km*0.62137119;
        System.out.println("Value in mile "+mile+mile);

    }
}
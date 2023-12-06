//write  java program  which ask the user to enter his/her name and greets them with "hello <name> have a good day" text
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        System.out.println("What is your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println(" Hello "+name+" have a good day");
    }
}

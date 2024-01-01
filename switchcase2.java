package com.company;
import java.util.Scanner;
public class switchcase2 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are almost adult");
                break;
            case 21:
                System.out.println("You are going to join a job ");
                break;
            case 60:
                System.out.println("You are going to get retair ");
                break;
            default:
                System.out.println("Enjoy your life");

        }

    }
}

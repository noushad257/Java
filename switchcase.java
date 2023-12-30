package com.company;
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();
        if (age>40){
            System.out.println("You are experienced");
        } else if(age>33){
            System.out.println("You are semi experienced");
        } else if (age>30) {
            System.out.println("You are semi semi experienced");
        } else {
            System.out.println("You are not experienced");
        }

    }
}

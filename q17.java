//website url checking

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String website=sc.next();

        if(website.endsWith(".org")){
            System.out.println("This is an organization website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is an commercial website");
        }
        else if(website.endsWith(".govt")){
            System.out.println("This is an governmental website");
        }
        else if(website.endsWith(".bd")){
            System.out.println("This is a bangladeshi website");
        }
        else if(website.endsWith(".us")){
            System.out.println("This is an American website");
        }
        else if(website.endsWith(".edu")){
            System.out.println("This is an Educational website");
        }
        else{
            System.out.println("Invalid website");
        }

    }
}

package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args ) {
        Scanner scan=new Scanner(System.in);
        /*
        Scanner is name of the class
        scan is just a variable like we create the primitive variables
        = is operations
        System.in is tells computer we want to read data from the keyboars

        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("Your age "+age+" Years old");
        System.out.println("please enter your weight");
        double weight=scan.nextDouble();
        System.out.println(" your weight is "+weight+" kgs");
        System.out.println("are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("hungry "+hungry);
        System.out.println("please enter your gender");
        char  gender=scan.next().charAt(0);// char type of scanner
        System.out.println("your gender is "+gender);
        System.out.println("please enter your name");
        String name=scan.next(); //when we have to take just one word as input
        System.out.println("your name is "+name);
        scan.nextLine();// we need to add this scan.nextline(); to input full name
        System.out.println("please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("your full name is "+fullName);
        scan.close(); // to close the code
        /*

         */


    }
}

package class4;

import java.util.Scanner;

public class ScannerDemo1  {
    public static void main(String[] args) {

        //below line helps us get the input manually typing it   from the keyboard to console

        Scanner input= new Scanner(System.in); //
        System.out.println("please enter your name");
        String name=input.nextLine(); // nextLine is used when we have to type sentences in console manually
        System.out.println("my name is "+name);


    }
}

package class5;

import java.util.Scanner;

public class SwitchClassDemo5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender m f");
        char gender=scanner.next().charAt(0);


        switch(gender){
            case 'f':
                System.out.println("female");
                break;
            case'F':
                System.out.println("female 1");
                break;
            case 'm'://if we dont use break after this,it will not print out
            case'M':
                System.out.println("male");
                break;
            default:
                System.out.println("not specified");
        }

    }
}

package class6;

import java.util.Scanner;

public class LogicalOrdemo {
    public static void main(String[] args) {
        System.out.println("please enter the day");
        Scanner scan=new Scanner(System.in);
        String day=scan.next();
        if(day.equalsIgnoreCase("Monday")||day.equals("Friday")){
            System.out.println("no Class today");
        }else if(day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase("Friday")){
            System.out.println("java class enjoy");
        }else if (day.equalsIgnoreCase("Wednesday")|| day.equalsIgnoreCase("Sunday")){
            System.out.println("Manual testing class");
        }else if (day.equalsIgnoreCase("Thursday")){
            System.out.println("Review class");
        }else{
            System.out.println("wrong day entered");
        }
}
}
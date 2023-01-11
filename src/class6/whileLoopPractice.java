package class6;

public class whileLoopPractice {
    public static void main(String[] args) {
        //write a loop to print numbers from 1 to 100
        // write a loop to print add numbers from 1 to 15
        // write a loop to print this numbers 5,10,15,20,25,30 till 50

        int number1 = 1;
        while (number1 < 101) {
            System.out.println(number1);
            number1++;
        }
        System.out.println("*****************");

        int number2 = 1;
        while (number2 < 16) {
            System.out.println(number2);
            number2 += 2;
        }
        System.out.println("***************");
        int number3 = 5;
        while (number3 < 55) {
            System.out.println(number3);
            number3 += 5;

        }
    }
}

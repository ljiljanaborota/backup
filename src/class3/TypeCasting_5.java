package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte) number;
        float f=10.5f;
        int num=(int)f;

        System.out.println(shorterNumber);
        System.out.println(num);
        //if we try to put in large box small box,java dont  complain,but if we need to put big box into small
        // we need to do next
        byte b=10;
        int number2=b;
        short c=(short) number2;
        System.out.println(b); // we need to type cast it to store contents So you repeat the name of the box into()
        float eggs=12.5f;
        int wholePart=(int) eggs;// type casting we are converting from float to int
        System.out.println(wholePart);







    }
}

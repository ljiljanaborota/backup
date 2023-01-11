package class4;

public class IfDemo1 {
    public static void main(String[] args) {
        int money = 15000;
        if (money > 1000) {
            System.out.println("lets buy an iphone");
        }
        if (money > 2000) {
            System.out.println("lets also buy a macbook");
        }

        boolean mothersDay = true;
        if (mothersDay) {
            System.out.println("happy Mother's day");
        }
        String name = "Sardar";
        // equals method only used for non primitives
        if (name.equals("Sardar")) {
            System.out.println("i love football");

        }
    }
}

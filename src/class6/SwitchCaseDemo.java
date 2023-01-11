package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String country = "USA";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()) {
            // country.toLowerCase convert the text to lower case
            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("pasta");
                break;
            case "afganistan":
                System.out.println("kebab");
                break;
            default:
                System.out.println("wrong country");


        }
    }
}
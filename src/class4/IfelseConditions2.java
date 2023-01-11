package class4;

public class IfelseConditions2 {
    public static void main(String[] args) {
        boolean rain=false;
        if(rain){
            System.out.println("lets take the umbrella");  // plan A -because boolean is true,it will print to console
             // lets take the umbrella, but if you change boolean to false,it will print lets just take the hat
        } else{
            System.out.println("lets just take the hat"); // plan B
        }
        boolean breakTime=true;
        if(breakTime){
            System.out.println("lets take the break");

        }else{
            System.out.println("lets continue to class");
        }

    }
}

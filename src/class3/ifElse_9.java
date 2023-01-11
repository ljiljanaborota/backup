package class3;

public class ifElse_9 {
    public static void main(String[] args) {

        char c='M';
        if(c=='M'){  // Symbol = IS ALWAYS THERE,THATS WHY FOR EQUAL YOU ADDING ONE MORE ==
            System.out.println("Male");
        }
        String name="Sam"; // with none primitive data types such as String we can not use == symbol
        // we will use after name. then equal than("sam") inside ()
        if(name.equals("Sam")){
            System.out.println("Amazing student");// symbol ! can change true to false and false to true
            if(!name.equals("Sam")){
                System.out.println("Super Amazing student");
            }
        }
    }
}

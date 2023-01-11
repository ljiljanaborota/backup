package class5;



public class logicalOperators2 {
    public static void main(String[] args) {
     /* if the score in all the subjects are greather than 90,print brilliant student
     otherwise print You need to work hard


      */

        double mathScore = 92.5;
        ;
        double historyScore = 91.5;
        double ScienceScore = 93.5;
        /*
        if (mathScore > 90.0) {
            if (historyScore > 90.0) {
            }
            if (ScienceScore > 90.0)
                System.out.println("you are brilliant student");
            } else {
                System.out.println("you need to work harder");
            }
        } else {
            System.out.println("you are brilliant student");
        }
            }/*

         */


        if (mathScore > 90 && historyScore > 90 && ScienceScore > 90) {
            System.out.println("brilliant student");
        }else{
                System.out.println("you need to work hard");
            }

            }


        }

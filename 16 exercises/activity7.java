package exercises;

/**
 * activity7
 */
import java.util.Scanner;

public class activity7 {


    public static void main(String[] args) {
        /*
         * Write a java program that would print the name of the supervisor under a certain department number.

         */

         int dep;

         Scanner scan = new Scanner(System.in);

         System.out.print("Enter Department Number: ");
         dep = scan.nextInt();

         if (dep <= 1 || dep <=3){
            System.out.println("Supervisor: Mr. X");
         } else if (dep <= 4 || dep <=7){
            System.out.println("Supervisor: Mr. Y");
         } else if (dep <=8 || dep <= 9){
            System.out.println("Supervisor: Mr. Z");
         } else{
            System.out.println("Number Exceeded.");
         }

         scan.close();


    }
}

package exercises;
/**
 * activity9
 */
import java.util.Scanner;

public class activity9 {

    public static void main(String[] args) {
        /*
         * To watch the Movie Deadpool the user must be at the right age to enter the cinema. Create a 
flowchart that will ask the user’s age to determine if he/she can watch it or not. Display “You’re too 
Young and you’re not allowed” if the age is 16 below otherwise display “You’re old enough! You’re 
allowed”

         */

       int age;

       Scanner scan = new Scanner(System.in);

       System.out.print("Enter age: ");
       age = scan.nextInt();

       if (age < 16){
        System.out.println("You're too young and you're not allowed.");
       } else{
        System.out.println("You're old enough! You're allowed.");
       }

       scan.close();

    }
}

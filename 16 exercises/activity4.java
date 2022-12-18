package exercises;

/**
 * activity4
 */
import java.util.Scanner;
public class activity4 {

    public static void main(String[] args) {
        
       /* Write a java program that will ask the user to enter a character
        * (either M or F) to indicate the user's gender. Display
        Male if the user enters the value of M and Female for the
        value of F.
        */

        String gender;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your gender (M/F): ");
        gender = scan.nextLine();

        if (gender.equals("M") || gender.equals("m")){
            System.out.println("You are Male.");
        }else if (gender.equals("F") || gender.equals("f")){
            System.out.println("You are Female.");
        }else{
            System.out.println("Invalid input!");
        }

        scan.close();
    }
}
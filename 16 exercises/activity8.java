package exercises;
/**
 * activity8
 */
import java.util.Scanner;

public class activity8 {

    public static void main(String[] args) {
        /*
         * Write a java program that will print the student’s letter grade given the following specifications
         */

         int grade;
         Scanner scan = new Scanner (System.in);

         System.out.print("Enter Grades: ");
         grade = scan.nextInt();

         if (grade >= 90){
            System.out.println("A");
         } 
         else if (grade >= 80){
            System.out.println("B");
         }
          else if ( grade >= 70){
            System.out.println("C");
         } 
         else if (grade >= 60){
            System.out.println("D");
         } 
         else if (grade < 60){
            System.out.println("F");
         } 
         else {
            System.out.println("Error!");
         }

         scan.close();


    }
}

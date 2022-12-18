/**
 * addingloop
 */
import java.util.Scanner;
public class addingloop {

    public static void main(String[] args) {
        /*
         * Write a program that add up integers that the user enters. First the program asks how many 
numbers will be added up. then the program prompts the user for each number.
Finally it prints the sum. You may use any looping     structures. 
         */


         int count, add,total=0;
         Scanner scan = new Scanner(System.in);

         System.out.println("How many integers will be added? :");

         count = scan.nextInt();

         for (int i = 0; i<count; i++){
            System.out.println("enter integer: ");
            add = scan.nextInt();

            total = total + add;
         }

          System.out.println("The sum is: "+total);


          scan.close();


    }
}
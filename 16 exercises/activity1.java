package exercises;


/**
 * activity1
 */
import java.util.Scanner;
public class activity1 {

    public static void main(String[] args) {
        /*Create a java program that will ask the user for any book
         title and the number of copies. Compute for the amount due by 
         assuming that all prices of the books are equal to PHP 250.00.
         Display Title and the amount due.
        */

        String book;
        int copy;
        double totalc;



        Scanner scan = new Scanner(System.in);

        System.out.print("Enter book title: ");
        book = scan.nextLine();

        System.out.print("Enter amount of copy/copies: ");
        copy = scan.nextInt();
        

        totalc = (double) (250.00*copy);

      
        System.out.println("");
        System.out.println("Book aquired: "+ book);
        System.out.println("Total copy/copies: "+ copy);
        System.out.println("Amount due: "+"PHP "+ String.format("%.2f",totalc));

        scan.close();
    }
}
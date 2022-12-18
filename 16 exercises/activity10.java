package exercises;
/**
 * activity10
 */
import java.util.Scanner;
public class activity10 {

    public static void main(String[] args) {
        /*
         * Create a java program that will display the perimeter of the square, depending on the user’s input.
         */

         int perimeter, side;

         Scanner scan = new Scanner(System.in);

         System.out.print("Enter value: ");
         side = scan.nextInt();

         perimeter = 4*side;

         System.out.println("Perimeter of square: "+perimeter);

         scan.close();
    }
}

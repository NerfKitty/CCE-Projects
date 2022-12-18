package exercises;
/**
 * activity11
 */
import java.util.Scanner;
public class activity11 {

    public static void main(String[] args) {
        //Create a java program that will display the area of a rectangle, depending on the user’s input
     
        int area, width, length;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the value of width: ");
        width = scan.nextInt();

        System.out.print("Enter the value of length: ");
        length = scan.nextInt();

        area = width*length;

        System.out.println("Area of a rectangle: "+ area);

        scan.close();



    }
}
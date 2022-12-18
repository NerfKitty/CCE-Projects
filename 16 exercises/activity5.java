package exercises;
/**
 * activity5
 */
import java.util.Scanner;
public class activity5 {

    public static void main(String[] args) {
           /*
         * Write a program that will examine the value of a variable called 
         * temperature and display one of the following messages below, depending on the
         * value assigned to the value assigned to temperature. Ask the user
         * to input the value of the temperature.
         */

        int temp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        temp = scan.nextInt();

        if (temp < 0){
           System.out.println("ICE");
        }
        else if (temp == 0  || temp<= 100){
           System.out.println("WATER");
        }
        else if (temp > 100){
           System.out.println("STEAM");
        }

        scan.close();

    }
}

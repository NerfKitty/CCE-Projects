/**
 * programming2
 */
import java.util.Scanner;
public class Arithmetic {

    public static void main(String[] args) {
        /*
         * Write a java program named Arithmetic.java that has two numbers
         * namely varuable num1 and num2, and compute and display the four arithmetic 
         * operators.
         */
   
         int num1, num2, sum, sub, prod, quo;
         Scanner scan = new Scanner (System.in);

         System.out.println("********INPUT**********");
         System.out.print("Enter first number: ");
         num1 = scan.nextInt();
         System.out.print("Enter second number: ");
         num2 = scan.nextInt();

         sum = num1 + num2;
         sub = num1 - num2;
         prod = num1 * num2;
         quo = num1 / num2;


         System.out.println("*********OUTPUT**********");
         System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
         System.out.println("The difference of "+num1+" and "+num2+" is "+sub); 
         System.out.println("The product of "+num1+" and "+num2+" is "+prod);
         System.out.println("The quotient of "+num1+" and "+num2+" is "+quo);

         scan.close();
    }
}

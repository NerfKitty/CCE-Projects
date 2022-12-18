package exercises;
/**
 * activity6
 */
import java.util.Scanner;
public class activity6 {

    public static void main(String[] args) {
        /*
         * Write a java program to calculate a person’s salary. The rate per hour is Php 80.00. Allow the user to 
enter the number of hours worked. Any hours worked in excess to 8 hours is paid at the rate of 1.5 
times than the normal hourly rate. Calculate and display the normal pay, overtime pay and the total 
salary of the person without deduction.
         */

         double hour_w, normal_p, overtime_p, ex_rate,total1, total2;

         Scanner scan = new Scanner (System.in);

         System.out.print("Enter of number hours worked: ");
         hour_w = scan.nextDouble();

        

        normal_p = 80.00 * 8;
        overtime_p = 80.00 * hour_w - normal_p;
        ex_rate = overtime_p *1.5;
        total1 = normal_p + overtime_p;
        total2 = normal_p + ex_rate;

        if (overtime_p <= 0){

            System.out.println("Normal pay: "+String.format("%.2f",normal_p));
            System.out.println("Overtime pay: "+String.format("%.2f",overtime_p));
            System.out.println("TOTAL: "+String.format("%.2f",total1));

        }
        else if (overtime_p > 0){
            System.out.println("Normal pay: "+String.format("%.2f",normal_p));
            System.out.println("Overtime pay: "+ String.format("%.2f", ex_rate));
            System.out.println("TOTAL: "+ String.format("%.2f",total2));
        }
        else {
            System.out.println("System Error!");
        }

        scan.close();


    }
}

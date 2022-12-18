package exercises;

/**
 * activity
 */
import java.util.Scanner;
public class activity2 {

    public static void main(String[] args) {
        
    // Sample 1: take three numbers from the user and print the greatest number
     
    int num1, num2, num3;
     Scanner a = new Scanner(System.in);

     System.out.print("Enter first number: ");
     num1 = a.nextInt();
      
     System.out.print("Enter second number: ");
     num2 = a.nextInt();

     System.out.print("Enter third number: ");
     num3 = a.nextInt();

     if (num1>num2 && num1>num3){
        System.out.println("The greatest: "+num1);
     }else if (num2>num1 && num2>num3){
        System.out.println("The greatest: "+num2);
     }else if (num3>num1 && num3>num2){
        System.out.println("The greatest: "+num3);
     }else{
        System.out.println("System error!");
     }
     
     a.close();

    }
}
package exercises;
/**
 * activity12
 */

 import java.util.Scanner;

public class activity15 {

    /*
     * You have been asked to write a program for the Sam and Ella Delicatessen. The program takes deli 
orders from the Internet. It asks for the item, its price in cents, and if overnight shipping is wanted. 
The program writes out the order and the charges. Regular shipping for items under $10 is $2.00; for 
items $10 or more shipping is $3.00. For overnight delivery add $5.00.
     */

   /**
 * @param args
 */
public static void main(String[] args) {
    
    int delivery;
    double price, s_total1 = 7.00, s_total2 = 8.00, s_total3 = 2.00, s_total4 = 3.00;
    String prod_name;

    // s_total 1 & 2 = overnight shipping price
    // s_total 3 & 4 = regular shipping price

   
    Scanner scan = new Scanner (System.in);
    
    System.out.println("-------INPUT--------");

    System.out.print("Enter the item: ");
    prod_name = scan.nextLine();
    
    System.out.print("Enter the price: ");
    price = scan.nextDouble();

    System.out.print("Overnight delivery? (yes = 1) (no = 0): ");
    delivery = scan.nextInt();



    if (delivery == 1 && price < 10.00){
        System.out.println("");
        System.out.println("-------OUTPUT-------");
        System.out.println("Invoice:");
        System.out.printf("%-15s %-15s%n",prod_name,String.format("%.2f",price));
        System.out.printf("%-15s %-15s%n","Shipping",String.format("%.2f",s_total1));
        System.out.printf("%-15s %-15s%n","Total",String.format("%.2f",(price+s_total1)));
        
    } else if (delivery == 1 && price > 10.00){
        System.out.println("");
        System.out.println("-------OUTPUT--------");
        System.out.println("Invoice:");
        System.out.printf("%-15s %-15s%n",prod_name,String.format("%.2f",price));
        System.out.printf("%-15s %-15s%n","Shipping",String.format("%.2f",s_total2));
        System.out.printf("%-15s %-15s%n","Total",String.format("%.2f",(price+s_total2)));
    } else if (delivery == 0 && price < 10.00){
        System.out.println("");
        System.out.println("-------OUTPUT--------");
        System.out.println("Invoice:");
        System.out.printf("%-15s %-15s%n",prod_name,String.format("%.2f",price));
        System.out.printf("%-15s %-15s%n","Shipping",String.format("%.2f",s_total3));
        System.out.printf("%-15s %-15s%n","Total",String.format("%.2f",(price+s_total3)));
    } else if (delivery == 0 && price > 10.00){
        System.out.println("");
        System.out.println("-------OUTPUT--------");
        System.out.println("Invoice:");
        System.out.printf("%-15s %-15s%n",prod_name,String.format("%.2f",price));
        System.out.printf("%-15s %-15s%n","Shipping",String.format("%.2f",s_total4));
        System.out.printf("%-15s %-15s%n","Total",String.format("%.2f",(price+s_total4)));
    } else{
        System.out.println("Error!");

        
    }
    
    scan.close();

   }



}
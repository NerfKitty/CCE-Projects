package exercises;
import java.util.*;
public class activity3 {
    public static void main(String[] args) {      
         int cent;

         int quarters,dime,nickel,pennies;

         Scanner scan = new Scanner(System.in);

         System.out.print("Enter the amount of change from 1 to 99: ");
         cent = scan.nextInt();
         
         quarters = (int) (cent / 25);
         dime = (int) ((cent%25)/10);
         nickel = (int) (((cent%25)%10)/5);
         pennies = (int) ((cent%25)%10) % 5;

         if (cent <= 99){
            System.out.println();
            System.out.println(cent+ " cents in coins:" );
            System.out.printf("%-1s %-15s %-15s%n", quarters," quarters ",(quarters*25));
            System.out.printf("%-1s %-15s %-15s%n", dime," dime ",(dime*10));
            System.out.printf("%-1s %-15s %-15s%n",nickel," nickels",(nickel*5));
            System.out.printf("%-1s %-15s %-15s%n",pennies," penny ",(pennies*1));
            System.out.println();

         }
          else{
            System.out.println();
            System.out.println("Invalid-Maximum is only 1-99");
            System.out.println();
         }

         scan.close();
    
    }
}
import java.util.Scanner;
public class looping2 {
    public static void main(String[] args) {
        /*
         * Modify start and end value. Ask the user for the starting value and end value and print its 
inclusive numbers. If the user's input an ending value less than the start value display the 
message “ Your end value is less than the start value. Please try again…” and then ask the user 
to ask enter a new ending value again. You may use any looping structures
         */

         int start_num, end_num;

         Scanner scan = new Scanner(System.in);

         System.out.print("Enter start value: ");
          start_num = scan.nextInt();

         System.out.print("Enter end value: ");
          end_num = scan.nextInt();

         while(true){
            
            if (end_num < start_num){
                System.out.println("Your end value is less than the start value. Please try again...");
                System.out.print("Enter end value: ");
                end_num = scan.nextInt();
  
             } else{
    
                System.out.println("Numbers are:");
                while (start_num <= end_num){
                    System.out.println(start_num);
                    start_num ++;
                 }
                 break;
                
             }

             scan.close();


         }
    }
}

import java.util.Scanner;
public class looping1 {
    public static void main(String[] args) {

        /*
         * Write a program to ask the user For a starting value and end value then prints the values from 
         * the starting to end value. You may use any looping structures
         */
        
        int start_num, end_num;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter start number: ");
        start_num = scan.nextInt();
        System.out.print("Enter end number: ");
        end_num = scan.nextInt();

        while (start_num <= end_num){
            System.out.println(start_num);
            start_num ++;
            
        }

        scan.close();





    }
}

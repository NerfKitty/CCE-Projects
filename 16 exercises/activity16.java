package exercises;
import java.util.*;
public class activity16 {
    public static void main(String[] args) {
        String [] months = {null,"January", "February" , "March", "April", "May" , "June", "July", "August", "September", "October", "November", "December"};
        int numMonth = 0;
        int year =0;
        int days =0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a month number: ");
        numMonth =scan.nextInt();
        System.out.print("Input a year: ");
        year = scan.nextInt();
        scan.close();

        if (numMonth == 1  || numMonth ==3 || numMonth == 5 || numMonth == 7 || numMonth == 8 || numMonth == 10 || numMonth == 12 ){
            days = 31;
        }  else if (numMonth == 2){
                 if (year % 4 ==0){
                         if (year % 100 ==0){
                             if (year % 400 == 0){
                                 days = 29;
                             } else {
                                 days = 28;
                             }
                         } else {
                             days = 29;
                         }
                 } else {
                    days = 28;
                 }
              
            } else if (months.length == 0 || months.length > 13) {
                System.out.println("Enter a valid number of months!");
            } else{
                System.out.println("system error!");
            }

        System.out.println("");
        System.out.println( months[numMonth] + " year "+ year + " has "+ days + " days");
        System.out.println();
      
    } 
}
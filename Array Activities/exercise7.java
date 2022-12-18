//author: Fernyl Jean
import java.util.*;
public class exercise7 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        int row = 0,column = 0;
   
        System.out.print("Enter number of Rows: ");
        row = scan.nextInt();

        System.out.print("Enter number of Columns: ");
        column = scan.nextInt();
        
        for (int r = 1; r<= row; r++){
            for (int c = 1; c <= column; c++){
                System.out.format("%1$-6d",r*c);
            }
            System.out.println("");
        }
      
       scan.close();
    }
}

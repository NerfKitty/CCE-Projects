import java.util.Arrays;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int loop, i = 0;

        String [] input = new String[];


        System.out.print("Enter how many inputs: ");
        loop = scan.nextInt();
        scan.nextLine();

        for ( i = 1; i <= loop; i++){
                System.out.print("Enter First Name and Last Name: ");
                input = scan.nextLine().split(",");
        }

       System.out.println(Arrays.toString(input));

  



    }
}

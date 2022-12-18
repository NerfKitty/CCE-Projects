import java.util.*;
public class year {
    
    public static void main(String[] args) {
        int numYear =0;
        Scanner scan = new Scanner (System.in);
       

        System.out.print("Input the year: ");
        numYear = scan.nextInt();
        scan.close();
        
            if (numYear % 4 ==0){
                if (numYear % 100 ==0){
                    if (numYear % 400 == 0){
                        System.out.println();
                        System.out.println(numYear + " is a leap year ");
                        System.out.println();
                    } else {
                        System.out.println();
                       System.out.println(numYear + "is a not a leap year");
                       System.out.println();
                    }
                } else {
                    System.out.println();
                    System.out.println(numYear + " is a leap year");
                    System.out.println();
                }
            } else {
                System.out.println();
              System.out.println(numYear +" is not a leap year");
              System.out.println();
            }


            scan.close();

    }
}

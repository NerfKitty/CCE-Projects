/**
 * loopingex1
 */
import java.util.Scanner;
public class loopingex1 {

    public static void main(String[] args) {
     


        String names[] = {"Joanne","Claire","Rodeth","Jonathan","Alvin"};
        try (Scanner scan = new Scanner (System.in)) {
            String find_names;
            boolean nameFound = false;
        

            System.out.print("Search name: ");
            find_names = scan.nextLine();

            for (String name1:names){
                if (name1.equals(find_names)){
                    nameFound= true;
                     break;
                }
                
            }  

            
                if (nameFound){
                    System.out.println(find_names+ " is found");
                   
                 
                } else {
                    System.out.println(find_names+" is not found. Try again.");
                               
                }
            
            
        }


    }
}
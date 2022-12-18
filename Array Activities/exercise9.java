//author: Fernyl Jean
import java.util.*;
public class exercise9 {
    public static void main(String[] args) {
        String[] name = {"Clariedhel","Jayvive","Weelyn","Lorre","Mae Ann","Nelson","Mervin","Jay","Ryan","Eric","Michael","Joy","Angelo","Marisol","Kent","Vincent"};
         
        Scanner scan = new Scanner(System.in);
        String search, select;
        boolean nameFound = false;

        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT -TVL-B9");
        System.out.println("***********************************************************************");
        
       do {

        System.out.print("Please enter the Student Name:    ");
        search = scan.nextLine();

        for (String name123 : name){
            if (name123.equals(search)){
                nameFound = true;
                break;
            }
        }

        System.out.println("-----------------------------------------------------------------------");
        if (nameFound){
            System.out.print("NAME FOUND");
        } else{
            System.out.print("No Name Found");
        }


        System.out.print( ",  Do you want to Search another name? (Y/N):    ");
        select = scan.nextLine();
         } 
            while (select.equals("Y")||select.equals("y"));

                if (select.equals("N")||select.equals("n")){
                    System.out.println("SEARCHING STOPPED");
                } else{
                    System.out.println("Invalid Input.");
                    System.out.println("SEARCHING STOPPED");
                }

                scan.close();

    }
}

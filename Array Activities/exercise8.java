//author: Fernyl Jean
import java.util.*;
public class exercise8 {
    public static void main(String[] args) {
        String[] name = {"Clariedhel","Jayvive","Weelyn","Lorre","Mae Ann","Nelson","Mervin","Jay","Ryan","Eric","Michael","Joy","Angelo","Marisol","Kent","Vincent"};
        
        Scanner scan = new Scanner(System.in);
        String search;
        boolean nameFound = false;

        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT -TVL-B9");
        System.out.println("***********************************************************************");
        System.out.print("Please enter the Student Name:     ");
        search = scan.nextLine();
        System.out.println("-----------------------------------------------------------------------");

            for (String name123 : name){
                if (name123.equals(search)){
                    nameFound = true;
                    break;
                }
            }


        if (nameFound){
            System.out.println("Name found: "+ search);
        } else{
            System.out.println("No Name Found");
        }

        scan.close();

    }
}

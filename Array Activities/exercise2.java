//author: Fernyl Jean
import java.util.*; 
public class exercise2 { 
     public static void main(String[] args) { 
        Integer [] elements = { 12, 23, 120, 60, 320, 45, 93, 21, 60, 310 }; 
        ArrayList<Integer> select = new ArrayList<Integer>();
       
        for (int i = elements.length-1; i >= 0; i--){
         select.add(elements[i]);
        }
            String elem = select.toString().replace("[", "").replace("]", "");
            System.out.println("ELEMENTS:  " + elem);
    } 
}
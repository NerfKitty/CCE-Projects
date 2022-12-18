//author: Fernyl Jean
import java.util.*;
public class exercise1 {
    public static void main(String[] args) {
        printArrays();  
    }

    static void printArrays(){
    	int sum = 0 , index;
    	
    	int [] elements = {12,23,120,60,320,45,93,21,60,310};
  
        String sPrint = Arrays.toString(elements).replace("[", "").replace("]", " ");
        System.out.printf("%-10s %-10s%n","ELEMENTS: ", sPrint);
         for (index = 0; index < elements.length; index++)
           sum += elements[index];
             System.out.printf("%-10s %-10s%n","SUM: ",sum);
    }  
}
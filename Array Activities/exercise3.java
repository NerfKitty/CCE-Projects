//author: Fernyl Jean
import java.util.*;
public class exercise3 {
    public static void main(String[] args) {
        
    	int [] elements = {12,23,120,60,320,45,93,21,60,310};
        ArrayList<Integer> select = new ArrayList<Integer>();
  
            for (int i = 0; i <= 4; i++){  
                select.add(elements[i*2]);
            }

        String elem = select.toString().replace("[", "").replace("]", "");
        System.out.println("ELEMENTS: " + elem);
    }
}

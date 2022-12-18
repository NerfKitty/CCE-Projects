//author: Fernyl Jean
import java.util.*;
public class exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
      
        Scanner scan =  new Scanner(System.in);
        int num = 0;
  
        System.out.println("***********INPUT***********");
     
        for (int i = 0; i < 10; i++){
            System.out.print("Enter a number:  ");
            num = scan.nextInt();

            int rem = num%2;

            if (rem == 0){
                even.add(num);
            }else{
                odd.add(num);
            }

        }
          
        //convert arraylist to array
        String evenArray = even.toString();
        String oddArray = odd.toString();

        System.out.println("***********OUTPUT***********");

        String evenElem = evenArray.toString().replace("[", "").replace("]", "");
        System.out.printf("%-16s %-16s%n","Even Elements: ", evenElem);

        String oddElem = oddArray.toString().replace("[", "").replace("]", "");
        System.out.printf("%-16s %-16s%n","Odd Elements: ", oddElem);

        scan.close();

    }
}
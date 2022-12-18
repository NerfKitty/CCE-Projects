import java.util.Arrays;
public class array3 {
    public static void main(String[] args) {
        int numbers [] = {21, 7, 14, 28, 35, 56, 42};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]> max){
                max = numbers[i];
            }
        }
        for (int j = 0; j < numbers.length; j++){
           if (numbers[j] < min){
              min = numbers[j];
           }
        }
        System.out.println("Elements: " + Arrays.toString(numbers));
        System.out.println("Maximum value of an array: "+ max);
        System.out.println("Minimum value of an array: "+min);

    }
}

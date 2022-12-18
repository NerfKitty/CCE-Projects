import java.util.Arrays;
public class array2 {
    public static void main(String[] args) {
        int numbers [] = {21, 7, 14, 28, 35, 56, 42};
        int smallest = numbers[0];
        int secondSmallest = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        for (int j = 0; j < numbers.length; j++){
            if (numbers[j] < secondSmallest && numbers[j] != smallest){
                secondSmallest = numbers[j];
            }
        }
        System.out.println("Elements are: " + Arrays.toString(numbers));
        System.out.println("The second smallest element is: "+ secondSmallest);

    }
}

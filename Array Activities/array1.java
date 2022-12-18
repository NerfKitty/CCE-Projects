import java.util.Arrays;
public class array1 {
    public static void main(String[] args) {
        int numbers [] = {21, 7, 14, 43, 35, 56, 42};
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }
        }

        for (int j = 0; j < numbers.length; j++){
            if (numbers[j]>secondLargest && numbers[j]!=largest){
                secondLargest = numbers[j];
            }
        }
        System.out.println("Elements: "+ Arrays.toString(numbers));
        System.out.println("The second largest number is: "+ secondLargest);
    }
}

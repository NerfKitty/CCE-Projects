//author: Fernyl Jean
public class exercise5 {
    public static void main(String[] args) {
    
        int[][] data = {
            {23,34,50,21,10},
            {12,22,10,6,4},
            {4,67,16,40,56},
            {82,85,29,30,7},
            {6,34,34,45,79},
        };

         int row = data.length;
         int col = data[0].length;
         int sum, greater =0, index = 0;


         for (int i = 0; i < row;i++){
            sum = 0;
               for (int j = 0; j < col; j++){
                  sum = sum + data[i][j];
                  if (sum> greater){
                     greater = sum; 
                     index = i+1;
                  }

               }

               System.out.println("Sum of Row "+(i+1)+":   "+sum);
         }
                  System.out.println("");
                  System.out.println("The Largest Sum is Row "+index+": "+greater);

   }
}

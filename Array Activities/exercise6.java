//author: Fernyl Jean
public class exercise6 {
    public static void main(String[] args) {
        
        int[][] data = {
            {23,34,50,21,10},
            {12,22,10,6,4},
            {4,67,16,40,56},
            {82,85,29,30,7},
            {6,34,34,45,79},
        };
    
         int row = data[0].length;
         int col = data.length;
         int sum, greater =0, index = 0;
   
         for (int i = 0; i < col;i++){
            sum = 0;

            for (int j = 0; j < row; j++){
               sum = sum + data[j][i];
                  if (sum> greater){
                     greater = sum; 
                     index = i+1;
                  }
            }

            System.out.println("Sum of Column "+(i+1)+":   "+sum);
         }

                  System.out.println("");
                  System.out.println("The Largest Sum is Column "+index+": "+greater);
       
   }
}

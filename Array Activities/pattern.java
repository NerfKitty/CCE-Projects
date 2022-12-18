public class pattern {
    public static void main(String[] args) {
        System.out.println("I.");
        System.out.println();
        for (int col = 1; col<=4; col++){
          for (int row = 1; row<=10; row++){
            System.out.print("*");
          }
          System.out.println();
        }

        System.out.println();
        System.out.println("II.");
        System.out.println();

        for (int col = 1; col <= 5; col++){
            for(int row = 1; row <= col ; row++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("III.");
        System.out.println();


       System.out.println("*");
       for (int count = 4; count > 0; count--){
          for (int col = 0; col < count-1; col++)
          System.out.print(" ");
          for (int row = 5; row > count -1; row--)
          System.out.print("*");
          System.out.println();

       }
            System.out.println();
    }
}

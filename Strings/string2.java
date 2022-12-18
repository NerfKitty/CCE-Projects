import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int emp,i = 0;
        String [] data;

        System.out.print("Enter the number of employees: ");
        emp = scan.nextInt();
        System.out.println("Note: enter the information in the following order and use comma to separate data.");
        System.out.println("(ID, Name, Level, Salary, Rate)");
        emp = scan.nextInt();

        while (i <= emp){
            System.out.println("Enter employee number "+i+": ");
            data = scan.nextLine().split(",");
            i++;
        }

            //    for(int j = 0; j < data.length; j++){
            //         System.out.println("data: ");
            //     System.out.println(data[j]);

            //    }
            


     
        System.out.println("Successfully Saved in Employee's List.");

       
        scan.close();
    }
}

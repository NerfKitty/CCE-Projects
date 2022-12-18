import java.io.IOException;
import java.util.Scanner;
public class inter {

     static String empID, name, payroll;
     static int rPerDay, sss, pagibig, philh, late , rule;
     static int numDaysW, numHoursl, numUndert, numAbsent;

    public static void main(String[] args) {
        Scanner scan =  new Scanner (System.in);
        int answer,answer1 = 0;
       
        System.out.print("Employee ID: ");
        empID = scan.nextLine();
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Payroll For: ");
        payroll = scan.nextLine();

        System.out.println();

        System.out.print("Rate per Day: ");
        rPerDay = scan.nextInt();
        System.out.print("SSS Contribution: ");
        sss = scan.nextInt();
        System.out.print("PAG IBIG Contribution: ");
        pagibig = scan.nextInt();
        System.out.print("PhilHealth Conribution: ");
        philh = scan.nextInt();

        System.out.println();

        System.out.print("Number of Days Worked: ");
        numDaysW = scan.nextInt();
        System.out.print("Number of Hours Late: ");
        numHoursl = scan.nextInt();
        System.out.print("No. of Hours Undertime: ");
        numUndert = scan.nextInt();
        System.out.print("Number of Days Absent: ");
        numAbsent = scan.nextInt();

        rule= rPerDay/8;

        System.out.println();
        System.out.println("NOTE:");
        System.out.println();
        System.out.println("Every one hour late and undertime is equivalent to: PHP "+ rule);
        System.out.println("Every one day absent is equivalent to: PHP "+rPerDay);
        System.out.println();
    
        do {
            System.out.print("Do you wish to print a payslip?: YES[1]  NO[0]: ");
            answer = scan.nextInt();
            System.out.println();
            if (answer == 1){
                clear();
                slip();
                break;
            }else if(answer == 0){
                System.out.print("Are you sure? Your progress will not be saved."+" YES[1]  CANCEL[0]: ");
                answer1 = scan.nextInt();
                System.out.println();
            }
        } while(answer1 != 1);

        scan.close();
    }

    public static void slip(){

        int basicpay = (rPerDay*numDaysW);
        int late1 = (numHoursl*rule);
        int undertime = (numUndert*rule);
        int absent = (rPerDay*numAbsent);
        int totaldec = (sss+pagibig+philh+late1+undertime+absent);
        int homepay = basicpay - totaldec;
        String alignFormat = "%-30s %-20s %-13s%n";

       System.out.println("-----------------------------------------------------");
       System.out.println("|                       PAYSLIP                     |");
       System.out.println("+---------------------------------------------------+");
       System.out.println("|                                                   |");
       System.out.printf(alignFormat,"|    Period as of: ",payroll,"|");
       System.out.printf(alignFormat,"|    ID Number: ",empID,"|");
       System.out.printf(alignFormat,"|    Name: ",name,"|");
       System.out.println("|                                                   |");
       System.out.println( "| INCOME                                            |");
       System.out.printf(alignFormat,"|    Basic Pay: ","PHP "+basicpay,"|");
       System.out.printf(alignFormat,"|    TOTAL INCOME: ","PHP "+basicpay,"|");
       System.out.println("|                                                   |");
       System.out.println( "| DEDUCTION                                         |");
       System.out.printf(alignFormat,"|  SSS Contribution: ","PHP "+sss,"|");
       System.out.printf(alignFormat,"|  PAG IBIG Contribution: ", "PHP "+pagibig,"|");
       System.out.printf(alignFormat,"|  PhilHealth Contribution: ","PHP "+philh,"|");
       System.out.printf(alignFormat,"|    Late: ","PHP "+late1,"|");
       System.out.printf(alignFormat,"|    Undertime: ","PHP "+undertime,"|");
       System.out.printf(alignFormat,"|    Absent: ","PHP "+absent,"|");
       System.out.println("|                                                   |");
       System.out.printf(alignFormat,"|    TOTAL DEDUCTION: ","PHP "+totaldec,"|");
       System.out.printf(alignFormat,"|    TAKE HOMEPAY: ","PHP "+homepay,"|");
       System.out.println("|                                                   |");
       System.out.println("+---------------------------------------------------+");

    }


    public static void clear(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

}
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class guessmyAge {

    static String date;
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    static LocalDate now = LocalDate.now();
    static int curdateY, curdateM, curdateD, mybdayY, mybdayM, mybdayD;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Current date: " + dtf.format(now));
        System.out.println();

        System.out.println("Enter your birthdate and I will guess your age. ");
        System.out.print("Follow this format (mm/dd/yyyy): ");
        date = scan.nextLine();
        System.out.println();
        getAge();
        System.out.println();
        scan.close();

    }

    public static void getAge() {

        String bDay[] = date.split("/");
        String curDate[] = dtf.format(now).split("/");

        for (int i = 0; i < bDay.length; i++) {
            mybdayY = Integer.parseInt(bDay[2]);
            mybdayD = Integer.parseInt(bDay[1]);
            mybdayM = Integer.parseInt(bDay[0]);

        }

        for (int j = 0; j < curDate.length; j++) {
            curdateY = Integer.parseInt(curDate[2]);
            curdateD = Integer.parseInt(curDate[1]);
            curdateM = Integer.parseInt(curDate[0]);

        }
        int age = curdateY - mybdayY;

        if (mybdayM > curdateM) {
            age--;
            System.out.println("Your age is: " + age);

        } else if (mybdayM == curdateM) {
            if (mybdayD > curdateD) {
                age--;
                System.out.println("Your age is: " + age);
            } else {
                System.out.println("Your age is: " + age);
            }

        } else {
            System.out.println("Your age is: " + age);
        }
    }
}
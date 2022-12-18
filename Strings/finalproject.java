import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class finalproject {
  static String name, or_no, prodName;
  static int numofItems, prod_qty, prod_price, subprice, amtdue, pay = 0;
  static double vat, totalpay;
  static ArrayList<String> itemName = new ArrayList<>();
  static ArrayList<Integer> itemPrice = new ArrayList<>();
  static ArrayList<Integer> itemQty = new ArrayList<>();
  static DecimalFormat df = new DecimalFormat("0.00");
  static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
  static LocalDateTime now = LocalDateTime.now();

  public static void main(String[] args) {
    boolean apply = false;
    Scanner scan = new Scanner(System.in);

    System.out.printf("%36s", "PURCHASE RECEIPT SYSTEM\n");
    System.out.printf("%36s", "INPUT THE DETAILS BELOW\n");
    System.out.println("*".repeat(50));
    System.out.print("Enter Cashier Name: \t\t");
    name = scan.nextLine();
    System.out.print("Enter OR No.: \t\t\t");
    or_no = scan.nextLine();
    System.out.println("*".repeat(50));

    do {

      apply = false;

      try {
        System.out.print("Enter Number of Items: \t\t");
        numofItems = scan.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please try again...");
        apply = true;
        scan.nextLine();
      }

    } while (apply);

    System.out.println("*".repeat(50));

    prompt();
    scan.close();

  }

  public static void prompt() {
    Scanner m = new Scanner(System.in);
    boolean apply = false;

    for (int i = 1; i <= numofItems; i++) {
      System.out.println("Item Number: " + i);
      System.out.print("Enter Item Name: \t\t");
      prodName = m.nextLine();
      itemName.add(prodName);

      do {
        apply = false;
        try {
          System.out.print("Enter Price: \t\t\t");
          prod_price = Integer.parseInt(m.nextLine());
          itemPrice.add(prod_price);

        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please try again...");
          apply = true;
        }

      } while (apply);

      do {
        apply = false;
        try {
          System.out.print("Enter Quantity: \t\t");
          prod_qty = Integer.parseInt(m.nextLine());
          itemQty.add(prod_qty);

        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please try again...");
          apply = true;
        }

      } while (apply);

      System.out.println("-".repeat(50));
    }

    for (int i = 0; i < numofItems; i++) {
      subprice = itemPrice.get(i) * itemQty.get(i);
      amtdue += subprice;
    }

    vat = amtdue * 0.05;
    totalpay = amtdue + vat;
    System.out.println("TOTAL PAYMENT: \t\t\t" + "Php " + df.format(totalpay));

    System.out.println("*".repeat(50));

    while (true) {
      if (pay < totalpay) {

        do {
          apply = false;
          try {
            System.out.print("Enter Customer Payment: \t");
            pay = m.nextInt();

            if (pay < totalpay){
              System.out.println("Insufficient amount. Please try again...");
              System.out.println();
            }

          } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again...");
            System.out.println();
            apply = true;
            m.nextLine();
          }

        } while (apply);

      } else {
        clear();
        receipt();
        break;
      }
    }

    m.close();
  }

  public static void receipt() {

    System.out.println("-".repeat(50));
    System.out.printf("%-10s %-37s %-1s%n", "|", " ", "|");
    System.out.printf("%-14s %-33s %-1s%n", "|", "Gaisano Grand Mall", "|");
    System.out.printf("%-9s %-38s %-10s%n", "|", "Mc Authur Highway, Digos City", "|");
    System.out.printf("%-7s %-40s %-10s%n", "|", "Tel. #: 553-2847 " + " Fax: 679652382", "|");
    System.out.printf("%-10s %-37s %-10s%n", "|", "GST Reg. No.: 00023648294", "|");
    System.out.printf("%-16s %-31s %-10s%n", "|", "RBC: 529873290", "| ");
    System.out.printf("%-10s %-37s %-1s%n", "|", " ", "|");
    System.out.printf("%-15s %-32s %-10s%n", "|", "PURCHASE RECEIPT", "|");
    System.out.printf("%-10s %-37s %-1s%n", "|", " ", "|");
    System.out.printf("%-48s %-1s%n", "|  Cashier: " + name, "|");
    System.out.print("|  Date: " + dtf.format(now));
    System.out.printf("%-8s %-19s  %-1s%n"," ","O.R. No.: " + or_no, "|");
    System.out.println("*".repeat(50));
    System.out.printf("%-12s %-24s %-10s %-1s%n", "|  Qty.", "Items", "Price", "|");
    System.out.println("-".repeat(50));

    for (int i = 0; i < numofItems; i++) {
      System.out.printf("%-12s %-22s %-12s %-1s%n", "|  " + itemQty.get(i), itemName.get(i),
          "Php " + df.format(itemPrice.get(i) * itemQty.get(i)), "|");
    }
    System.out.println("*".repeat(50));
    System.out.printf("%-35s %-12s %-1s%n", "|  SUBTOTAL: ", "Php " + df.format(amtdue), "|");
    System.out.printf("%-35s %-12s %-1s%n", "|  VAT (5%): ", "Php " + df.format(vat), "|");
    System.out.printf("%-10s %-37s %-1s%n", "|", " ", "|");
    System.out.printf("%-35s %-12s %-1s%n", "|  TOTAL: ", "Php " + df.format(totalpay), "|");
    System.out.printf("%-10s %-37s %-1s%n", "|", " ", "|");
    System.out.printf("%-35s %-12s %-1s%n", "|  CASH", "Php " + df.format(pay), "|");
    System.out.printf("%-35s %-12s %-1s%n", "|  CHANGE", "Php " + (df.format(pay - totalpay)), "|");
    System.out.printf("%-10s %-37s %-1s%n", "|", " ", "|");
    System.out.printf("%-12s %-35s %-1s%n", "|", "THANK YOU FOR SHOPPING!", "|");
    System.out.printf("%-10s %-37s %-1s%n", "|", " ", "|");
    System.out.println("-".repeat(50));

  }

  public static void clear() {
    try {
      if (System.getProperty("os.name").contains("Windows"))
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      else
        Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {
    }
  }
}

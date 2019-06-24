import java.util.Scanner;

public class lab2_8 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("enter yearly interest rate: ");
      double annualInt = input.nextDouble();
      double monthlyInt = annualInt / 1200;

      System.out.print("enter number of years: ");
      int numYear = input.nextInt();

      System.out.print("enter loan amount: ");
      double loanAmount = input.nextDouble();

      double monthlyPay = loanAmount * monthlyInt / (1 - 1 / Math.pow(1 + monthlyInt, numYear * 12));
      double totalPay = monthlyPay * numYear * 12;

      System.out.println("Monthly payment is: " + (int)(monthlyPay * 100) / 100.0 );
      System.out.println("Total payment is: " + (int)(totalPay * 100) / 100.0 );

    }

}

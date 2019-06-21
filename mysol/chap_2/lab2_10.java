import java.util.Scanner;

public class lab2_10 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("enter amount: ");
      double amount = input.nextDouble();
      int remainAmount = (int) (amount * 100);

      int numOfOneDollar = remainAmount / 100;
      remainAmount = remainAmount % 100;

      int numOfQuarter = remainAmount / 25;
      remainAmount = remainAmount % 25;

      int numOfDime = remainAmount / 10;
      remainAmount = remainAmount % 10;

      int numOfNickel = remainAmount / 5;
      remainAmount = remainAmount % 5;

      int numOfPenny = remainAmount;

      int i = 1, j = 2;
      System.out.println("is....." + (i + j));

      System.out.println("your amount: " + amount + " consist of \n" +
        "\t" + numOfOneDollar + " dollars\n" +
        "\t" + numOfQuarter + " quarters\n" +
        "\t" + numOfDime + " dimes\n" +
        "\t" + numOfNickel + " nickels\n" +
        "\t" + numOfPenny + " pennies\n");


    }

}

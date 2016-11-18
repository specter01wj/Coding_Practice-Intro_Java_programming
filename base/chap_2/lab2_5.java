import java.util.Scanner;

public class lab2_5 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("enter degree in Fah:");
      double fah = input.nextDouble();

      double celsius = (5.0 / 9) * (fah - 32);

      System.out.println("Fah: " + fah + "; Celsius: " + celsius);

    }

}

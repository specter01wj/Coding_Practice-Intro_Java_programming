import java.util.Scanner;

public class lab2_4 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("enter seconds:");
      int seconds = input.nextInt();

      int min = seconds / 60;
      int remainSec = seconds % 60;

      System.out.println(seconds + "seconds is: " + min + "mins and " + remainSec + "seconds");

    }

}

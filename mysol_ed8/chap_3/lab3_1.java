import java.util.Scanner;

public class lab3_1 {

    public static void main(String[] args) {
      int num1 = (int)(System.currentTimeMillis() % 10);
      int num2 = (int)(System.currentTimeMillis() * 7 % 10);

      Scanner input = new Scanner(System.in);

      System.out.print("what is " + num1 + " + " + num2 + "?\n");

      int answer = input.nextInt();

      System.out.println("result " + answer + " is: " + (num1 + num2 == answer));

    }

}

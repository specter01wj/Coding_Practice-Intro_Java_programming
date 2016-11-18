import java.util.Scanner;

public class lab3_7 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integer: ");
      int num = input.nextInt();

      System.out.println("Is " + num + "\n\tdivisible by 2 and 3? " +
        (num % 2 == 0 && num % 3 == 0) + "\n\tdivisible by 2 or 3? " +
          (num % 2 == 0 || num % 3 == 0) + "\n\tdivisible by 2 or 3, but not both? " +
            (num % 2 == 0 ^ num % 3 == 0) );

    }

}

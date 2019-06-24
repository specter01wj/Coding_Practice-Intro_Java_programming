import java.util.Scanner;

public class lab4_5 {

    public static void main(String[] args) {
      int data;
      int sum = 0;

      Scanner input = new Scanner(System.in);

      do{
        System.out.print("Enter an int value: ");
        data = input.nextInt();
        sum += data;
      }while(data != 0);

      System.out.println("sum is: " + sum);

    }


}

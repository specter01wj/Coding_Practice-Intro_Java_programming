import java.util.Scanner;

public class lab4_8_ex {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("Enter 1st int: ");
      int n1 = input.nextInt();
      System.out.print("Enter 2nd int: ");
      int n2 = input.nextInt();

      int gcd = 1;
      for(int k = 2; k <= n1 && k <= n2; k++){
        if(n1 % k == 0 && n2 % k == 0)
          gcd = k;
      }
      System.out.println("GCD is:" + gcd);

    }


}

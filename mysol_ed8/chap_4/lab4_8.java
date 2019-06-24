import java.util.Scanner;

public class lab4_8 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("Enter 1st int: ");
      int n1 = input.nextInt();
      System.out.print("Enter 2nd int: ");
      int n2 = input.nextInt();

      int gcd = 1, k = 2;
      while(k <= n1 && k <= n2){
        if(n1 % k == 0 && n2 % k == 0){
          gcd = k;
        }
        k++;
      }
      System.out.println("GCD is:" + gcd);

    }


}

import java.util.Scanner;

public class lab5_6 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 1st int: ");
      int n1 = input.nextInt();
      System.out.print("Enter 2nd int: ");
      int n2 = input.nextInt();

      System.out.println("Greatest common divisor: " + gcd(n1, n2));
    }

    public static int gcd(int n1, int n2){

      int gcd = 1, k = 2;

      while(k <= n1 && k <= n2){
        if(n1 % k == 0 && n2 % k == 0){
          gcd = k;
        }
        k++;
      }

      return gcd;
    }

}

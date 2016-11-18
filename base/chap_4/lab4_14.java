import java.util.Scanner;

public class lab4_14 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of PRIME: ");
      int numPrime = input.nextInt();
      System.out.print("Enter number primes per line: ");
      int numPerLine = input.nextInt();

      int count = 0, num = 2;
      System.out.println("the first " + numPrime + " prime numbers are: ");

      while(count < numPrime){
        boolean isPrime = true;

        for(int divisor = 2; divisor <= num / 2; divisor++){
          if(num % divisor == 0){
            isPrime = false;
            break;
          }
        }

        if(isPrime){
          count++;
          if(count % numPerLine == 0){
            System.out.println(num);
          }
          else{
            System.out.print(num + " ");
          }
        }

        num++;
      }

    }


}

import java.util.Scanner;

public class lab5_7 {

    public static void main(String[] args) {

      System.out.print("The first 50 prime num: \n");
      printPrimeNum(100);

    }

    public static void printPrimeNum(int numOfPrime){
      final int NUM_OF_PRIME_PER_LINE = 10;
      int count = 0, num = 2;

      while(count < numOfPrime){
        if(isPrime(num)){
          count++;

          if(count % NUM_OF_PRIME_PER_LINE == 0){
            System.out.printf("%-5s\n", num);
          }
          else{
            System.out.printf("%-5s", num);
          }

        }

        num++;
      }
    }

    public static boolean isPrime(int num){
      for(int div = 2; div <= num / 2; div++){
        if(num % div == 0){
          return false;
        }
      }
      return true;
    }


}

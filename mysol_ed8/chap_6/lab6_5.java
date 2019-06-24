import java.util.Scanner;

public class lab6_5 {

    public static void main(String[] args) {
      System.out.println("The switch strings: ");
      printMax(34, 3, 3, 2, 56.5, 101.2, 302.3, 33.3, 56.8);
      printMax(new double[]{1, 2, 3, 4.5, 5.7, 13.4, 6.7});
    }

    public static void printMax(double... numbers){

      if(numbers.length == 0){
        System.out.println("No argument passed!");
        return;
      }
      double result = numbers[0];

      for(int i = 0; i < numbers.length; i++){
        if(numbers[i] > result)
          result = numbers[i];
      }
      System.out.println("Max value: " + result);

    }

}

import java.util.Scanner;

public class lab4_7 {

    public static void main(String[] args) {

      double sum = 0;
      for(double i = 0.01f; i <= 1.0f; i = i +  0.01f){
        sum += i;
      }
      System.out.println("Sum is:" + sum);

    }


}

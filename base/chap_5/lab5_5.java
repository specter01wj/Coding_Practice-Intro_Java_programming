import java.util.Scanner;

public class lab5_5 {

    public static void main(String[] args) {
      int num1 = 1, num2 = 2;
      System.out.println("Before: " + num1 + "; " + num2);
      swap(num1, num2);
      System.out.println("After: " + num1 + "; " + num2);

    }

    public static void swap(int n1, int n2){

      int tmp = n1;
      n1 = n2;
      n2 = tmp;
      System.out.println("Inside, after swap: " + n1 + "; " + n2);
      System.out.println("Inside, after swap: " + n1 + "; " + n2);

    }

}

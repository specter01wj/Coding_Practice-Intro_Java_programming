import java.util.Scanner;

public class lab5_9 {

    public static void main(String[] args) {

      System.out.println("Max 2 num int: " + max(3, 4));

      System.out.println("Max 2 num double: " + max(3.0, 5.4));

      System.out.println("Max 3 num double: " + max(3.0, 5.4, 10.12));
    }

    public static int max(int num1, int num2){
      if(num1 > num2)
        return num1;
      else
        return num2;
    }

    public static double max(double num1, double num2){
      if(num1 > num2)
        return num1;
      else
        return num2;
    }

    public static double max(double num1, double num2, double num3){
        return max(max(num1, num2), num3);
    }

}

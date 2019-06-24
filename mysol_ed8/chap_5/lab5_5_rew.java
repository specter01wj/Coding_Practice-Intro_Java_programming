import java.util.Scanner;

public class lab5_5_rew {

    public static void main(String[] args) {
      int num1 = 1, num2 = 2;
      System.out.println("Before: " + num1 + "; " + num2);
      int b1[] = swap(num1, num2);
      num1 = b1[0];
      num2 = b1[1];
      System.out.println("After: " + num1 + "; " + num2);


    }

    public static int[] swap(int n1, int n2){

      int tmp = n1;
      n1 = n2;
      n2 = tmp;
      System.out.println("Inside, after swap: " + n1 + "; " + n2);
    //  int a1[] = {n1, n2};

      return new int[]{n1,n2};

    }

}

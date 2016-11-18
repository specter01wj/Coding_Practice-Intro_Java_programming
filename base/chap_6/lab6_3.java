import java.util.Scanner;

public class lab6_3 {

    public static void main(String[] args) {
      int[] a = {1, 2};

      System.out.println("Before Swap: " + a[0] + " and " + a[1]);
      swap(a[0], a[1]);
      System.out.println("After Swap: " + a[0] + " and " + a[1]);

      System.out.println("Before invoking Swap: " + a[0] + " and " + a[1]);
      swapArray(a);
      System.out.println("After invoking Swap: " + a[0] + " and " + a[1]);
    }

    public static void swap(int n1, int n2){
      int tmp = n1;
      n1 = n2;
      n2 =tmp;
    }

    public static void swapArray(int[] array){
      int tmp = array[0];
      array[0] = array[1];
      array[1] =tmp;
    }

}

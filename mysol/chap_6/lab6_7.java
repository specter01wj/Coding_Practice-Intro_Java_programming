import java.util.Scanner;

public class lab6_7 {

    public static void main(String[] args) {
      System.out.println("Binary Search: ");

      int[] list = {1, 2, 4, 7, 14, 22, 25, 33, 36, 52};
      int k1 = BinarySearch.binarySearch(list, 4);
      int k2 = BinarySearch.binarySearch(list, 11);
      int k3 = BinarySearch.binarySearch(list, 33);
      System.out.println("k1: " + k1);
      System.out.println("k2: " + k2);
      System.out.println("k3: " + k3);
    }

}

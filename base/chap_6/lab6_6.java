import java.util.Scanner;

public class lab6_6 {

    public static void main(String[] args) {
      System.out.println("Linear Search: ");

      int[] list = {1, 4, 14, 2, 5, -3, 6, 2};
      int k1 = LinearSearch.linearSearch(list, 4);
      int k2 = LinearSearch.linearSearch(list, -4);
      int k3 = LinearSearch.linearSearch(list, -3);
      System.out.println("k1: " + k1);
      System.out.println("k2: " + k2);
      System.out.println("k3: " + k3);
    }

}

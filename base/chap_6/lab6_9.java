import java.util.Scanner;

public class lab6_9 {

    public static void main(String[] args) {
      System.out.println("Insertion Sort: ");

      double[] list = {1, 9, 4.6, -4.5, 14.6, 73, 36.6, 22.3};
      SelectionSort.selectionSort(list);
      for(int k = 0; k < list.length; k++){
        System.out.println("k" + k + " : " + list[k]);
      }

    }

}

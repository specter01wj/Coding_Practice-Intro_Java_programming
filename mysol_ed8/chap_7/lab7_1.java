import java.util.Scanner;

public class lab7_1 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int[][] m = new int[3][4];
      System.out.println("Enter:" + m.length + " rows and " + m[0].length + " column:");

      for(int i = 0; i < m.length; i++){
        for(int j = 0; j < m[i].length; j++){
          m[i][j] = input.nextInt();
        }
      }

      System.out.println("Sum of all: " + sum(m));

    }

    public static int sum(int[][] m){
      int total = 0;
      for(int i = 0; i < m.length; i++){
        for(int j = 0; j < m[i].length; j++){
          total += m[i][j];
        }
      }

      return total;
    }


}

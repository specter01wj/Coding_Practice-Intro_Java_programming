import java.util.Scanner;

public class lab6_1 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      boolean[] isCovered = new boolean[5];

      int num = input.nextInt();
      while(num != 0){
        isCovered[num - 1] = true;
        num = input.nextInt();
      }

      boolean allCovered = true;
      for(int i = 0; i < 5; i++){
        if(!isCovered[i]){
          allCovered = false;
          break;
        }
      }

      if(allCovered)
        System.out.println("Yes!");
      else
        System.out.println("No?");

    }


}

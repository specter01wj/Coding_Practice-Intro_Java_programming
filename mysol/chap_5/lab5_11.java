import java.util.Scanner;

public class lab5_11 {

    public static void main(String[] args) {
      final int NUM_OF_CHAR = 215;
      final int CHAR_PER_LINE = 55;

      for(int i = 0; i < NUM_OF_CHAR; i++){
        char ch = lab5_10.getRandomChar();
        if((i + 1) % CHAR_PER_LINE == 0)
          System.out.println(ch);
        else
          System.out.print(ch);
      }

      System.out.print('\n');
    }

}

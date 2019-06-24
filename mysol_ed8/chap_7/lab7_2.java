import java.util.Scanner;

public class lab7_2 {

    public static void main(String[] args) {

      char[][] answers = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'D', 'B', 'A', 'B', 'C', 'B', 'E', 'A', 'A', 'A'},
        {'A', 'C', 'A', 'C', 'A', 'D', 'E', 'C', 'A', 'D'},
        {'C', 'B', 'C', 'C', 'D', 'A', 'D', 'E', 'A', 'A'},
        {'A', 'B', 'A', 'C', 'C', 'A', 'E', 'B', 'A', 'D'},
        {'A', 'B', 'B', 'D', 'C', 'A', 'D', 'E', 'C', 'A'},
        {'B', 'C', 'C', 'C', 'E', 'A', 'E', 'C', 'A', 'D'},
        {'A', 'C', 'A', 'A', 'C', 'C', 'A', 'E', 'B', 'A'}
      };

      char[] keys = {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};

      for(int i = 0; i < answers.length; i++){
        int correctCnt = 0;
        for(int j = 0; j < answers[i].length; j++){
          if(answers[i][j] == keys[j])
            correctCnt++;
        }

      System.out.println("student " + i + " correct Cnt is: " + correctCnt * 10);
      }

    }

}

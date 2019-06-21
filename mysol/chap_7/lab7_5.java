import java.util.Scanner;

public class lab7_5 {

    public static void main(String[] args) {
      final int NUM_DAY = 10;
      final int NUM_HOUR = 24;
      double[][][] data = new double[NUM_DAY][NUM_HOUR][2];

      Scanner input = new Scanner(System.in);
      for(int k = 0; k < NUM_DAY * NUM_HOUR; k++){
        int day = input.nextInt();
        int hour = input.nextInt();
        double temperature = input.nextDouble();
        double humidity = input.nextDouble();
        data[day - 1][hour - 1][0] = temperature;
        data[day - 1][hour - 1][1] = humidity;
      }

      for(int i = 0; i < NUM_DAY; i++){
        double dailyTempTotal = 0, dailyHumidTotal = 0;
        for(int j = 0; j < NUM_HOUR; j++){
          dailyTempTotal += data[i][j][0];
          dailyHumidTotal += data[i][j][1];
        }

        System.out.println("Day " + i + "'s average temperature is " + dailyTempTotal / NUM_HOUR);
        System.out.println("Day " + i + "'s average humidity is " + dailyHumidTotal / NUM_HOUR);
      }

    }

}

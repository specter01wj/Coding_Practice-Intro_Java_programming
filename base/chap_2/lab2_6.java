public class lab2_6 {

    public static void main(String[] args) {

      long totalMill = System.currentTimeMillis();

      long currSec = (totalMill / 1000) % 60;
      long currMin = (totalMill / 1000 / 60) % 60;
      long currHour = (totalMill / 1000 / 60 / 60) % 24;

      System.out.println("Current Time: " + currHour + ": " + currMin + ": " + currSec);

    }

}

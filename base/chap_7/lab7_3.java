import java.util.Scanner;

public class lab7_3 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter num of points: ");
      int numOfPoints = input.nextInt();
      double[][] points = new double[numOfPoints][2];
      System.out.println("Enter " + numOfPoints + " points:");

      for(int i = 0; i < points.length; i++){
        points[i][0] = input.nextDouble();
        points[i][1] = input.nextDouble();
      }

      int p1 = 0, p2 = 1;
      double shortestDist = distanceCal(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

      for(int i = 0; i < points.length; i++){
        for(int j = i + 1; j < points.length; j++){
          double distance = distanceCal(points[i][0], points[i][1], points[j][0], points[j][1]);
          if(shortestDist > distance){
            p1 = i;
            p2 = j;
            shortestDist = distance;
          }
        }
      }

      System.out.println("closest 2 points: " + "(" + points[p1][0] + "," + points[p1][1] + ") and ("
                          + points[p2][0] + "," + points[p2][1] + ")");

    }


    public static double distanceCal(double x1, double y1, double x2, double y2){
      return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }


}

import java.util.Scanner;

public class lab8_11 {

    public static void main(String[] args) {

      Circle3 myCircle = new Circle3(1);
      int n = 5;
      printAreas(myCircle, n);

      System.out.println("\nRadius is: " + myCircle.getRadius() );
      System.out.println("n is: " + n);
    }

    public static void printAreas(Circle3 c, int times){
      System.out.println("Radius \t\tArea");
      while(times >= 1){
        System.out.println(c.getRadius() + "\t\t" + c.getArea());
        c.setRadius(c.getRadius() + 1);
        times--;
      }
    }

}

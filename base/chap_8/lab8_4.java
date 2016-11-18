import java.util.Scanner;

public class lab8_4 {

  public static void main(String[] args) {

    TV tv1 = new TV();
    tv1.turnOn();
    tv1.setChannel(30);
    tv1.setVolume(3);

    TV tv2 = new TV();
    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp();

    System.out.println("TV1 channel: " + tv1.channel + "; volume: " + tv1.volumeLevel);
    System.out.println("TV2 channel: " + tv2.channel + "; volume: " + tv2.volumeLevel);
  }

}

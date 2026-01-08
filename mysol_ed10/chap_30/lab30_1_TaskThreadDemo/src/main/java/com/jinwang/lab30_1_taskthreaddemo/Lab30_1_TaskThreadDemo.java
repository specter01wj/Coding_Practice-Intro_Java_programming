
package com.jinwang.lab30_1_taskthreaddemo;


public class Lab30_1_TaskThreadDemo {

    public static void main(String[] args) {
        // Create tasks
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);

        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

// Task for printing a specified character a specified number of times
class PrintChar implements Runnable {
  private final char charToPrint;
  private final int times;

  public PrintChar(char c, int t) {
    this.charToPrint = c;
    this.times = t;
  }

  @Override
  public void run() {
    for (int i = 0; i < times; i++) {
      System.out.print(charToPrint);
    }
  }
}

// Task for printing numbers from 1 to n
class PrintNum implements Runnable {
  private final int lastNum;

  public PrintNum(int n) {
    this.lastNum = n;
  }

  @Override
  public void run() {
    for (int i = 1; i <= lastNum; i++) {
      System.out.print(" " + i);
    }
  }
}


package com.jinwang.lab30_3_executordemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab30_3_ExecutorDemo {

    public static void main(String[] args) {
        // Create a fixed thread pool with three threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks
        executor.execute(new PrintChar('a', 100));
        executor.execute(new PrintChar('b', 100));
        executor.execute(new PrintNum(100));

        // Initiate orderly shutdown
        executor.shutdown();
    }
}

// Task for printing a character multiple times
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

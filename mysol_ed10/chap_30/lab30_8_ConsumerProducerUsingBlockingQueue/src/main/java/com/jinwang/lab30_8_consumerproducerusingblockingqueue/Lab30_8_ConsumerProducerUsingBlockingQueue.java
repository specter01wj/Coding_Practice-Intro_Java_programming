
package com.jinwang.lab30_8_consumerproducerusingblockingqueue;

import java.util.concurrent.*;

public class Lab30_8_ConsumerProducerUsingBlockingQueue {
    
    private static final ArrayBlockingQueue<Integer> buffer =
      new ArrayBlockingQueue<>(2);
    
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new ProducerTask());
        executor.execute(new ConsumerTask());
        executor.shutdown();
    }
    
    // Producer task
    private static class ProducerTask implements Runnable {
      @Override
      public void run() {
        try {
          int i = 1;
          while (true) {
            System.out.println("Producer writes " + i);
            buffer.put(i++); // blocks automatically if full
            Thread.sleep((int)(Math.random() * 10000));
          }
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      }
    }

    // Consumer task
    private static class ConsumerTask implements Runnable {
      @Override
      public void run() {
        try {
          while (true) {
            System.out.println("\t\t\tConsumer reads " + buffer.take());
            Thread.sleep((int)(Math.random() * 10000));
          }
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      }
    }
}

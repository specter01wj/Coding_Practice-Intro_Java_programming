
package com.jinwang.lab30_7_consumerproducer;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class Lab30_7_ConsumerProducer {
    
    private static final Buffer buffer = new Buffer();
    
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
        int i = 1;
        try {
          while (true) {
            System.out.println("Producer writes " + i);
            buffer.write(i++);
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
            System.out.println("\t\t\tConsumer reads " + buffer.read());
            Thread.sleep((int)(Math.random() * 10000));
          }
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      }
    }

    // Buffer with capacity = 1
    private static class Buffer {
      private static final int CAPACITY = 1;
      private final java.util.LinkedList<Integer> queue = new java.util.LinkedList<>();

      private static final Lock lock = new ReentrantLock();
      private static final Condition notEmpty = lock.newCondition();
      private static final Condition notFull = lock.newCondition();

      public void write(int value) throws InterruptedException {
        lock.lock();
        try {
          while (queue.size() == CAPACITY) {
            System.out.println("Wait for notFull condition");
            notFull.await();
          }
          queue.offer(value);
          notEmpty.signal();
        } finally {
          lock.unlock();
        }
      }

      public int read() throws InterruptedException {
        lock.lock();
        try {
          while (queue.isEmpty()) {
            System.out.println("\t\t\tWait for notEmpty condition");
            notEmpty.await();
          }
          int value = queue.remove();
          notFull.signal();
          return value;
        } finally {
          lock.unlock();
        }
      }
    }
}

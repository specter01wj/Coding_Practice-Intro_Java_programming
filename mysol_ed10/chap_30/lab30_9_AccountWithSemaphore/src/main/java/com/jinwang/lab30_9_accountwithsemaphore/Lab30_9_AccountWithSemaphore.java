
package com.jinwang.lab30_9_accountwithsemaphore;

import java.util.concurrent.*;
import java.util.concurrent.Semaphore;

public class Lab30_9_AccountWithSemaphore {
    
    private static Account account = new Account();
    
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        // Create and launch 100 threads
        for (int i = 0; i < 100; i++) {
          executor.execute(new AddAPennyTask());
        }

        executor.shutdown();

        // Wait until all tasks are finished
        while (!executor.isTerminated()) {
        }

        System.out.println("What is balance? " + account.getBalance());
    }
    
    // Task
    private static class AddAPennyTask implements Runnable {
      @Override
      public void run() {
        account.deposit(1);
      }
    }

    // Account using Semaphore
    private static class Account {
      private static Semaphore semaphore = new Semaphore(1); // ONE permit
      private int balance = 0;

      public int getBalance() {
        return balance;
      }

      public void deposit(int amount) {
        try {
          semaphore.acquire(); // enter critical section

          int newBalance = balance + amount;
          Thread.sleep(5); // magnify race condition
          balance = newBalance;

        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        } finally {
          semaphore.release(); // leave critical section
        }
      }
    }
}

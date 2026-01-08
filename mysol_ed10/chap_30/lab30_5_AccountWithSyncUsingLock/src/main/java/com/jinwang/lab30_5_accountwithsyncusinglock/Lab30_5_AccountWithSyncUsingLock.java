
package com.jinwang.lab30_5_accountwithsyncusinglock;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class Lab30_5_AccountWithSyncUsingLock {
    
    private static final Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
          executor.execute(new AddAPennyTask());
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        System.out.println("What is balance? " + account.getBalance());
    }
    
    // Task class
    public static class AddAPennyTask implements Runnable {
      @Override
      public void run() {
        account.deposit(1);
      }
    }

    // Account class protected by Lock
    public static class Account {
      private static final Lock lock = new ReentrantLock();
      private int balance = 0;

      public int getBalance() {
        return balance;
      }

      public void deposit(int amount) {
        lock.lock();
        try {
          int newBalance = balance + amount;
          Thread.sleep(5); // simulate delay
          balance = newBalance;
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        } finally {
          lock.unlock();
        }
      }
    }
}

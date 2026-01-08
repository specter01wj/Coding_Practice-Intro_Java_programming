
package com.jinwang.lab30_4_accountwithoutsync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab30_4_AccountWithoutSync {
    
    private static final Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        // Launch 100 tasks
        for (int i = 0; i < 100; i++) {
          executor.execute(new AddAPennyTask());
        }

        executor.shutdown();

        // Busy-wait until all tasks finish (intentional for demo)
        while (!executor.isTerminated()) {
          // do nothing
        }

        System.out.println("What is balance? " + account.getBalance());
    }
    
    // Task that adds 1 penny
    private static class AddAPennyTask implements Runnable {
      @Override
      public void run() {
        account.deposit(1);
      }
    }

    // Account class WITHOUT synchronization (race condition demo)
    private static class Account {
      private int balance = 0;

      public int getBalance() {
        return balance;
      }

      public void deposit(int amount) {
        int newBalance = balance + amount;

        // Artificial delay to expose race condition
        try {
          Thread.sleep(5);
        } catch (InterruptedException ignored) {
        }

        balance = newBalance;
      }
    }
}

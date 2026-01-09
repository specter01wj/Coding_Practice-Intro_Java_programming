
package com.jinwang.lab30_6_threadcooperation;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class Lab30_6_ThreadCooperation {
    
    private static final Account account = new Account();

    public static void main(String[] args) {
        System.out.println("Thread 1\t\tThread 2\t\tBalance");

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new DepositTask());
        executor.execute(new WithdrawTask());
    }
    
    // Task for depositing money
    public static class DepositTask implements Runnable {
      @Override
      public void run() {
        try {
          while (true) {
            account.deposit((int)(Math.random() * 10) + 1);
            Thread.sleep(1000);
          }
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      }
    }

    // Task for withdrawing money
    public static class WithdrawTask implements Runnable {
      @Override
      public void run() {
        try {
          while (true) {
            account.withdraw((int)(Math.random() * 10) + 1);
          }
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      }
    }

    // Shared account
    private static class Account {
      private final Lock lock = new ReentrantLock();
      private final Condition newDeposit = lock.newCondition();
      private int balance = 0;

      public int getBalance() {
        return balance;
      }

      public void withdraw(int amount) throws InterruptedException {
        lock.lock();
        try {
          while (balance < amount) {
            System.out.println("\t\t\tWait for a deposit");
            newDeposit.await();
          }
          balance -= amount;
          System.out.println("\t\t\tWithdraw " + amount +
            "\t\t" + balance);
        } finally {
          lock.unlock();
        }
      }

      public void deposit(int amount) {
        lock.lock();
        try {
          balance += amount;
          System.out.println("Deposit " + amount +
            "\t\t\t\t\t" + balance);
          newDeposit.signalAll();
        } finally {
          lock.unlock();
        }
      }
    }
}

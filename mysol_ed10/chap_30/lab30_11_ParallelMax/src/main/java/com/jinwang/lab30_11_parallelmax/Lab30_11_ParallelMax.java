
package com.jinwang.lab30_11_parallelmax;

import java.util.concurrent.*;

public class Lab30_11_ParallelMax {

    public static void main(String[] args) {
        final int N = 9_000_000;
        int[] list = new int[N];

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        long startTime = System.currentTimeMillis();
        int result = max(list);
        long endTime = System.currentTimeMillis();

        System.out.println("The maximal number is " + result);
        System.out.println("Number of processors is " +
                Runtime.getRuntime().availableProcessors());
        System.out.println("Time: " + (endTime - startTime) + " ms");
    }
    
    public static int max(int[] list) {
        ForkJoinPool pool = new ForkJoinPool();
        return pool.invoke(new MaxTask(list, 0, list.length));
    }

    private static class MaxTask extends RecursiveTask<Integer> {
        private static final int THRESHOLD = 1000;

        private final int[] list;
        private final int low;
        private final int high;

        MaxTask(int[] list, int low, int high) {
            this.list = list;
            this.low = low;
            this.high = high;
        }

        @Override
        protected Integer compute() {
            if (high - low <= THRESHOLD) {
                int max = list[low];
                for (int i = low + 1; i < high; i++) {
                    if (list[i] > max) {
                        max = list[i];
                    }
                }
                return max;
            } else {
                int mid = (low + high) >>> 1;

                MaxTask left = new MaxTask(list, low, mid);
                MaxTask right = new MaxTask(list, mid, high);

                left.fork();                // fork left
                int rightResult = right.compute(); // compute right
                int leftResult = left.join();

                return Math.max(leftResult, rightResult);
            }
        }
    }
}

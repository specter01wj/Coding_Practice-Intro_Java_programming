
package com.jinwang.lab30_10_parallelmergesort;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class Lab30_10_ParallelMergeSort {

    public static void main(String[] args) {
        final int SIZE = 7_000_000;

        int[] list1 = new int[SIZE];
        int[] list2 = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            int value = (int) (Math.random() * 10_000_000);
            list1[i] = value;
            list2[i] = value;
        }

        long startTime = System.currentTimeMillis();
        parallelMergeSort(list1);
        long endTime = System.currentTimeMillis();

        System.out.println(
            "\nParallel time with " +
            Runtime.getRuntime().availableProcessors() +
            " processors is " +
            (endTime - startTime) +
            " milliseconds"
        );

        startTime = System.currentTimeMillis();
        MergeSort.mergeSort(list2);
        endTime = System.currentTimeMillis();

        System.out.println(
            "\nSequential time is " +
            (endTime - startTime) +
            " milliseconds"
        );
    }
    
    public static void parallelMergeSort(int[] list) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new SortTask(list));
    }

    private static class SortTask extends RecursiveAction {

        private static final int THRESHOLD = 500;
        private final int[] list;

        SortTask(int[] list) {
            this.list = list;
        }

        @Override
        protected void compute() {
            if (list.length < THRESHOLD) {
                java.util.Arrays.sort(list);
                return;
            }

            int mid = list.length / 2;

            int[] firstHalf = new int[mid];
            int[] secondHalf = new int[list.length - mid];

            System.arraycopy(list, 0, firstHalf, 0, mid);
            System.arraycopy(list, mid, secondHalf, 0, list.length - mid);

            invokeAll(
                new SortTask(firstHalf),
                new SortTask(secondHalf)
            );

            MergeSort.merge(firstHalf, secondHalf, list);
        }
    }
}

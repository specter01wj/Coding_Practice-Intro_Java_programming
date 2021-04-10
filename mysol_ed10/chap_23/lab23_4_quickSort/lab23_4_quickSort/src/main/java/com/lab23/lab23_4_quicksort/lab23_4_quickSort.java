/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab23.lab23_4_quicksort;
import java.util.*;

/**
 *
 * @author jinwang
 */
public class lab23_4_quickSort {
    
    public static void main(String[] args) {
        int[] input = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        System.out.println("input: " + Arrays.toString(input));
        quickSort(input);
        
        
        
        
        
        
        System.out.println("output: " + Arrays.toString(input));
    }
    
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
          int pivotIndex = partition(list, first, last);
          quickSort(list, first, pivotIndex - 1);
          quickSort(list, pivotIndex + 1, last);
        }
    }

      /** Partition the array list[first..last] */
    private static int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
          // Search forward from left
          while (low <= high && list[low] <= pivot)
            low++;

          // Search backward from right
          while (low <= high && list[high] > pivot)
            high--;

          // Swap two elements in the list
          if (high > low) {
            int temp = list[high];
            list[high] = list[low];
            list[low] = temp;
          }
        }

        while (high > first && list[high] >= pivot)
          high--;

        // Swap pivot with list[high]
        if (pivot > list[high]) {
          list[first] = list[high];
          list[high] = pivot;
          return high;
        }
        else {
          return first;
        }
    }
    
}

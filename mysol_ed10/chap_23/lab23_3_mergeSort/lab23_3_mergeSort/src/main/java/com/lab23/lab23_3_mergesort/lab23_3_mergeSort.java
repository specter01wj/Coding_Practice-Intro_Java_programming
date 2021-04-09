/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab23.lab23_3_mergesort;
import java.util.*;

/**
 *
 * @author jinwang
 */
public class lab23_3_mergeSort {
    
    public static void main(String[] args) {
        int[] input = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        System.out.println("input: " + Arrays.toString(input));
        mergeSort(input);
        System.out.println("output: " + Arrays.toString(input));
    }
    
    public static void mergeSort(int[] list) {
        
        if(list.length > 1) {
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);
            
            int[] secondHalf = new int[list.length - list.length / 2];
            System.arraycopy(list, list.length / 2,
                secondHalf, 0, list.length - list.length / 2);
            mergeSort(secondHalf);
            
            merge(firstHalf, secondHalf, list);
        }
        
    }
    
    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
          if (list1[current1] < list2[current2])
            temp[current3++] = list1[current1++];
          else
            temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
          temp[current3++] = list1[current1++];

        while (current2 < list2.length)
          temp[current3++] = list2[current2++];
    }
    
}

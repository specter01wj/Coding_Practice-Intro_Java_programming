/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab23.lab23_5_heapsort;
import java.util.*;

/**
 *
 * @author jinwang
 */
public class lab23_5_heapSort {
    
    public static void main(String[] args) {
        Integer[] input = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        System.out.println("input: " + Arrays.toString(input));
        heapSort(input);
        System.out.println("output: " + Arrays.toString(input));
    }
    
    public static <E extends Comparable> void heapSort(E[] list) {
        // Create a Heap of integers
        Heap<E> heap = new Heap<E>();

        // Add elements to the heap
        for (int i = 0; i < list.length; i++)
          heap.add(list[i]);

        // Remove elements from the heap
        for (int i = list.length - 1; i >= 0; i--) {
          list[i] = heap.remove();
        }
    }
    
}

package com.lab23;
import java.util.*;

public class lab23_2_bubbleSort {

    public static void main(String[] args) {
        int[] input = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        int[] output = bubbleSort(input);
        System.out.println("input: " + Arrays.toString(input) + "\noutput: " + Arrays.toString(output));
    }

    public static int[] bubbleSort(int[] list) {
        boolean needNextPass = true;
        int[] output = list.clone();

        for(int k = 1; k < output.length && needNextPass; k++) {
            needNextPass = false;
            for(int i = 0; i < output.length - k; i++) {
                if(output[i] > output[i + 1]) {
                    int tmp = output[i];
                    output[i] = output[i + 1];
                    output[i + 1] = tmp;
                    needNextPass = true;
                }
            }
        }

        return output;
    }

}

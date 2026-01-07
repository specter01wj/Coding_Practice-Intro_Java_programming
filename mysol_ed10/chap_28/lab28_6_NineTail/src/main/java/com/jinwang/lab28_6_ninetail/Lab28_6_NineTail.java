
package com.jinwang.lab28_6_ninetail;

import java.util.List;
import java.util.Scanner;

public class Lab28_6_NineTail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial nine coins Hs and Ts: ");
        char[] initialNode = input.nextLine().toUpperCase().toCharArray();

        NineTailModel model = new NineTailModel();
        List<Integer> path =
            model.getShortestPath(NineTailModel.getIndex(initialNode));

        System.out.println("\nThe steps to flip the coins are:");
        for (int index : path) {
          NineTailModel.printNode(NineTailModel.getNode(index));
        }
    }
}


package com.jinwang.lab29_4_weightedninetail;


public class Lab29_4_WeightedNineTail {

    public static void main(String[] args) {
        System.out.print("Enter an initial nine coins' Hs and Ts: ");
        Scanner input = new Scanner(System.in);
        char[] initialNode = input.nextLine().toCharArray();

        WeightedNineTailModel model = new WeightedNineTailModel();

        var path =
            model.getShortestPath(NineTailModel.getIndex(initialNode));

        System.out.println("The steps to flip the coins are ");
        for (int p : path) {
          NineTailModel.printNode(NineTailModel.getNode(p));
        }

        System.out.println("The number of flips is " +
            model.getNumberOfFlips(
                NineTailModel.getIndex(initialNode)));
    }
}

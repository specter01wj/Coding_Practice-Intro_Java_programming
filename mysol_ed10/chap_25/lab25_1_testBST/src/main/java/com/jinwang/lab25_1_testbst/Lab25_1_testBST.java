
package com.jinwang.lab25_1_testbst;

import java.util.ArrayList;
/**
 *
 * @author jinwang
 */
public class Lab25_1_testBST {

    public static void main(String[] args) {
        // ---------- String BST ----------
        BST<String> tree = new BST<>();

        tree.add("George");
        tree.add("Michael");
        tree.add("Tom");
        tree.add("Adam");
        tree.add("Jones");
        tree.add("Peter");
        tree.add("Daniel");

        // Traversals
        System.out.print("Inorder (sorted): ");
        tree.inorder();

        System.out.print("\nPostorder: ");
        tree.postorder();

        System.out.print("\nPreorder: ");
        tree.preorder();

        System.out.println("\nNumber of nodes: " + tree.size());

        // Search
        System.out.println("Contains Peter? " + tree.contains("Peter"));

        // Path from root to Peter
        System.out.print("Path from root to Peter: ");
        ArrayList<BST.TreeNode<String>> path = tree.path("Peter");
        for (BST.TreeNode<String> node : path) {
          System.out.print(node.element + " ");
        }

        // ---------- Integer BST ----------
        Integer[] numbers = { 2, 4, 3, 1, 8, 5, 6, 7 };
        BST<Integer> intTree = new BST<>(numbers);

        System.out.print("\nInorder (sorted): ");
        intTree.inorder();
    }
}

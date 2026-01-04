
package com.jinwang.lab25_4_testbstwithiterator;

/**
 *
 * @author jinwang
 */
public class Lab25_4_TestBSTWithIterator {

    public static void main(String[] args) {
        BST<String> tree = new BST<>();

        tree.add("George");
        tree.add("Michael");
        tree.add("Tom");
        tree.add("Adam");
        tree.add("Jones");
        tree.add("Peter");
        tree.add("Daniel");

        System.out.print("Inorder traversal using iterator: ");
        for (String s : tree) {
          System.out.print(s.toUpperCase() + " ");
        }
    }
}

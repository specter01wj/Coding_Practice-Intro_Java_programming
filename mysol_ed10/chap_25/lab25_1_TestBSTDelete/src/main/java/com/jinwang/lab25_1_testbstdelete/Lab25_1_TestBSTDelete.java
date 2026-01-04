
package com.jinwang.lab25_1_testbstdelete;

/**
 *
 * @author jinwang
 */
public class Lab25_1_TestBSTDelete {

    public static void main(String[] args) {
        BST<String> tree = new BST<>();

        tree.add("George");
        tree.add("Michael");
        tree.add("Tom");
        tree.add("Adam");
        tree.add("Jones");
        tree.add("Peter");
        tree.add("Daniel");

        System.out.println("Initial tree:");
        printTree(tree);

        System.out.println("\nAfter removing George:");
        tree.remove("George");
        printTree(tree);

        System.out.println("\nAfter removing Adam:");
        tree.remove("Adam");
        printTree(tree);

        System.out.println("\nAfter removing Michael:");
        tree.remove("Michael");
        printTree(tree);
    }
    
    private static <E extends Comparable<E>> void printTree(BST<E> tree) {
        System.out.print("Inorder (sorted): ");
        tree.inorder();

        System.out.print("\nPostorder: ");
        tree.postorder();

        System.out.print("\nPreorder: ");
        tree.preorder();

        System.out.println("\nNumber of nodes: " + tree.size());
    }
    
}

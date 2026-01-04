
package com.jinwang.lab26_1_testavltree;

public class Lab26_1_TestAVLTree {

    public static void main(String[] args) {
        AVLTree<Integer> tree =
            new AVLTree<>(new Integer[]{25, 20, 5});
        System.out.print("After inserting 25, 20, 5:");
        printTree(tree);

        tree.add(34);
        tree.add(50);
        System.out.print("\nAfter inserting 34, 50:");
        printTree(tree);

        tree.add(30);
        System.out.print("\nAfter inserting 30:");
        printTree(tree);

        tree.add(10);
        System.out.print("\nAfter inserting 10:");
        printTree(tree);

        tree.remove(34);
        tree.remove(30);
        tree.remove(50);
        System.out.print("\nAfter removing 34, 30, 50:");
        printTree(tree);

        tree.remove(5);
        System.out.print("\nAfter removing 5:");
        printTree(tree);

        System.out.print("\nTraverse the elements in the tree: ");
        for (int e : tree) {
            System.out.print(e + " ");
        }
    }
    
    public static void printTree(BST<?> tree) {
        System.out.print("\nInorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.size());
        System.out.println();
    }
}

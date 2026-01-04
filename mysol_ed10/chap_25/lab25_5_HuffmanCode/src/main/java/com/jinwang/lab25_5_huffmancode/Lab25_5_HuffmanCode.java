
package com.jinwang.lab25_5_huffmancode;

import java.util.Scanner;
/**
 *
 * @author jinwang
 */
public class Lab25_5_HuffmanCode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        int[] counts = getCharacterFrequency(text);

        System.out.printf("%-15s%-15s%-15s%-15s%n",
            "ASCII Code", "Character", "Frequency", "Code");

        Tree tree = getHuffmanTree(counts);
        String[] codes = getCode(tree.root);

        for (int i = 0; i < counts.length; i++) {
          if (counts[i] > 0) {
            System.out.printf("%-15d%-15s%-15d%-15s%n",
                i, (char) i + "", counts[i], codes[i]);
          }
        }
    }
    
    /* ---------- Huffman Coding ---------- */

    public static String[] getCode(Tree.Node root) {
      String[] codes = new String[256];
      if (root != null) {
        assignCode(root, codes);
      }
      return codes;
    }

    private static void assignCode(Tree.Node node, String[] codes) {
      if (node.left != null && node.right != null) {
        node.left.code = node.code + "0";
        node.right.code = node.code + "1";
        assignCode(node.left, codes);
        assignCode(node.right, codes);
      } else {
        codes[node.element] = node.code;
      }
    }

    /* ---------- Huffman Tree ---------- */

    public static Tree getHuffmanTree(int[] counts) {
      Heap<Tree> heap = new Heap<>();

      for (int i = 0; i < counts.length; i++) {
        if (counts[i] > 0) {
          heap.add(new Tree(counts[i], (char) i));
        }
      }

      while (heap.getSize() > 1) {
        Tree t1 = heap.remove();
        Tree t2 = heap.remove();
        heap.add(new Tree(t1, t2));
      }

      return heap.remove();
    }

    /* ---------- Character Frequency ---------- */

    public static int[] getCharacterFrequency(String text) {
      int[] counts = new int[256];
      for (int i = 0; i < text.length(); i++) {
        counts[text.charAt(i)]++;
      }
      return counts;
    }

    /* ---------- Huffman Tree Structure ---------- */

    public static class Tree implements Comparable<Tree> {
      Node root;

      public Tree(Tree t1, Tree t2) {
        root = new Node();
        root.left = t1.root;
        root.right = t2.root;
        root.weight = t1.root.weight + t2.root.weight;
      }

      public Tree(int weight, char element) {
        root = new Node(weight, element);
      }

      @Override
      public int compareTo(Tree t) {
        return Integer.compare(t.root.weight, root.weight);
      }

      public static class Node {
        char element;
        int weight;
        Node left;
        Node right;
        String code = "";

        public Node() {}

        public Node(int weight, char element) {
          this.weight = weight;
          this.element = element;
        }
      }
    }
}

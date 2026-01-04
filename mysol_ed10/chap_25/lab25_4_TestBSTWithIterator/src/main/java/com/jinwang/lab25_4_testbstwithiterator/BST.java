
package com.jinwang.lab25_3_bstanimation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author jinwang
 */
public class BST<E extends Comparable<E>> extends AbstractTree<E> {

  protected TreeNode<E> root;
  protected int size = 0;

  /* ---------- Constructors ---------- */

  public BST() {}

  public BST(E[] elements) {
    for (E e : elements) {
      add(e);
    }
  }

  /* ---------- Query Operations ---------- */

  @Override
  public boolean contains(E element) {
    TreeNode<E> current = root;

    while (current != null) {
      int cmp = element.compareTo(current.element);
      if (cmp < 0) {
        current = current.left;
      } else if (cmp > 0) {
        current = current.right;
      } else {
        return true;
      }
    }
    return false;
  }

  @Override
  public int size() {
    return size;
  }

  public TreeNode<E> getRoot() {
    return root;
  }

  /* ---------- Modification Operations ---------- */

  @Override
  public boolean add(E element) {
    if (root == null) {
      root = createNode(element);
      size++;
      return true;
    }

    TreeNode<E> parent = null;
    TreeNode<E> current = root;

    while (current != null) {
      int cmp = element.compareTo(current.element);
      if (cmp < 0) {
        parent = current;
        current = current.left;
      } else if (cmp > 0) {
        parent = current;
        current = current.right;
      } else {
        return false; // duplicate
      }
    }

    if (element.compareTo(parent.element) < 0) {
      parent.left = createNode(element);
    } else {
      parent.right = createNode(element);
    }

    size++;
    return true;
  }

  @Override
  public boolean remove(E element) {
    TreeNode<E> parent = null;
    TreeNode<E> current = root;

    while (current != null) {
      int cmp = element.compareTo(current.element);
      if (cmp < 0) {
        parent = current;
        current = current.left;
      } else if (cmp > 0) {
        parent = current;
        current = current.right;
      } else {
        break;
      }
    }

    if (current == null) return false;

    // Case 1: no left child
    if (current.left == null) {
      if (parent == null) {
        root = current.right;
      } else if (element.compareTo(parent.element) < 0) {
        parent.left = current.right;
      } else {
        parent.right = current.right;
      }
    }
    // Case 2: has left child
    else {
      TreeNode<E> parentOfRightMost = current;
      TreeNode<E> rightMost = current.left;

      while (rightMost.right != null) {
        parentOfRightMost = rightMost;
        rightMost = rightMost.right;
      }

      current.element = rightMost.element;

      if (parentOfRightMost.right == rightMost) {
        parentOfRightMost.right = rightMost.left;
      } else {
        parentOfRightMost.left = rightMost.left;
      }
    }

    size--;
    return true;
  }

  public void clear() {
    root = null;
    size = 0;
  }

  /* ---------- Traversals ---------- */

  @Override
  public void inorder() {
    inorder(root);
  }

  protected void inorder(TreeNode<E> node) {
    if (node == null) return;
    inorder(node.left);
    System.out.print(node.element + " ");
    inorder(node.right);
  }

  @Override
  public void preorder() {
    preorder(root);
  }

  protected void preorder(TreeNode<E> node) {
    if (node == null) return;
    System.out.print(node.element + " ");
    preorder(node.left);
    preorder(node.right);
  }

  @Override
  public void postorder() {
    postorder(root);
  }

  protected void postorder(TreeNode<E> node) {
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.element + " ");
  }

  /* ---------- Iterator (Inorder) ---------- */

  @Override
  public Iterator<E> iterator() {
    return new InorderIterator();
  }

  private class InorderIterator implements Iterator<E> {

    private final ArrayList<E> elements = new ArrayList<>();
    private int index = 0;

    InorderIterator() {
      inorder(root);
    }

    private void inorder(TreeNode<E> node) {
      if (node == null) return;
      inorder(node.left);
      elements.add(node.element);
      inorder(node.right);
    }

    @Override
    public boolean hasNext() {
      return index < elements.size();
    }

    @Override
    public E next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      return elements.get(index++);
    }

    @Override
    public void remove() {
      if (index == 0) {
        throw new IllegalStateException();
      }
      BST.this.remove(elements.get(--index));
      elements.clear();
      index = 0;
      inorder(root);
    }
  }

  /* ---------- Utilities ---------- */

  protected TreeNode<E> createNode(E element) {
    return new TreeNode<>(element);
  }

  public ArrayList<TreeNode<E>> path(E element) {
    ArrayList<TreeNode<E>> list = new ArrayList<>();
    TreeNode<E> current = root;

    while (current != null) {
      list.add(current);
      int cmp = element.compareTo(current.element);
      if (cmp < 0) {
        current = current.left;
      } else if (cmp > 0) {
        current = current.right;
      } else {
        break;
      }
    }
    return list;
  }

  /* ---------- Node ---------- */

  public static class TreeNode<E> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    TreeNode(E element) {
      this.element = element;
    }
  }
}

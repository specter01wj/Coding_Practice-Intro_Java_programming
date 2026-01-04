
package com.jinwang.lab26_1_testavltree;

import java.util.ArrayList;

public class AVLTree<E extends Comparable<E>> extends BST<E> {

  public AVLTree() {}

  public AVLTree(E[] objects) {
    super(objects);
  }

  @Override
  protected AVLTreeNode<E> createNewNode(E e) {
    return new AVLTreeNode<>(e);
  }

  @Override
  public boolean insert(E e) {
    if (!super.insert(e)) return false;
    balancePath(e);
    return true;
  }

  private void updateHeight(AVLTreeNode<E> node) {
    if (node.left == null && node.right == null)
      node.height = 0;
    else if (node.left == null)
      node.height = 1 + ((AVLTreeNode<E>) node.right).height;
    else if (node.right == null)
      node.height = 1 + ((AVLTreeNode<E>) node.left).height;
    else
      node.height = 1 + Math.max(
        ((AVLTreeNode<E>) node.left).height,
        ((AVLTreeNode<E>) node.right).height
      );
  }

  private int balanceFactor(AVLTreeNode<E> node) {
    if (node.left == null) return node.height;
    if (node.right == null) return -node.height;
    return ((AVLTreeNode<E>) node.right).height
         - ((AVLTreeNode<E>) node.left).height;
  }

  private void balancePath(E e) {
    ArrayList<TreeNode<E>> path = path(e);
    for (int i = path.size() - 1; i >= 0; i--) {
      AVLTreeNode<E> A = (AVLTreeNode<E>) path.get(i);
      updateHeight(A);
      AVLTreeNode<E> parent =
        (A == root) ? null : (AVLTreeNode<E>) path.get(i - 1);

      if (balanceFactor(A) == -2) {
        if (balanceFactor((AVLTreeNode<E>) A.left) <= 0)
          balanceLL(A, parent);
        else
          balanceLR(A, parent);
      }
      else if (balanceFactor(A) == 2) {
        if (balanceFactor((AVLTreeNode<E>) A.right) >= 0)
          balanceRR(A, parent);
        else
          balanceRL(A, parent);
      }
    }
  }

  private void balanceLL(TreeNode<E> A, TreeNode<E> parent) {
    TreeNode<E> B = A.left;
    replaceParent(A, parent, B);
    A.left = B.right;
    B.right = A;
    updateHeight((AVLTreeNode<E>) A);
    updateHeight((AVLTreeNode<E>) B);
  }

  private void balanceRR(TreeNode<E> A, TreeNode<E> parent) {
    TreeNode<E> B = A.right;
    replaceParent(A, parent, B);
    A.right = B.left;
    B.left = A;
    updateHeight((AVLTreeNode<E>) A);
    updateHeight((AVLTreeNode<E>) B);
  }

  private void balanceLR(TreeNode<E> A, TreeNode<E> parent) {
    TreeNode<E> B = A.left;
    TreeNode<E> C = B.right;
    replaceParent(A, parent, C);
    A.left = C.right;
    B.right = C.left;
    C.left = B;
    C.right = A;
    updateHeight((AVLTreeNode<E>) A);
    updateHeight((AVLTreeNode<E>) B);
    updateHeight((AVLTreeNode<E>) C);
  }

  private void balanceRL(TreeNode<E> A, TreeNode<E> parent) {
    TreeNode<E> B = A.right;
    TreeNode<E> C = B.left;
    replaceParent(A, parent, C);
    A.right = C.left;
    B.left = C.right;
    C.left = A;
    C.right = B;
    updateHeight((AVLTreeNode<E>) A);
    updateHeight((AVLTreeNode<E>) B);
    updateHeight((AVLTreeNode<E>) C);
  }

  private void replaceParent(TreeNode<E> A, TreeNode<E> parent, TreeNode<E> newRoot) {
    if (A == root) root = newRoot;
    else if (parent.left == A) parent.left = newRoot;
    else parent.right = newRoot;
  }

  @Override
  public boolean delete(E e) {
    if (!super.delete(e)) return false;
    if (root != null) balancePath(root.element);
    return true;
  }

  protected static class AVLTreeNode<E extends Comparable<E>>
      extends BST.TreeNode<E> {
    protected int height = 0;
    public AVLTreeNode(E e) { super(e); }
  }
}

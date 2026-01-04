
package com.jinwang.lab25_1_testbst;

import java.util.Iterator;

/**
 *
 * @author jinwang
 */
public interface Tree<E> extends Iterable<E> {

  /* ---------- Query Operations ---------- */

  /** Returns true if the specified element exists in the tree */
  boolean contains(E element);

  /** Returns the number of elements in the tree */
  int size();

  /** Returns true if the tree contains no elements */
  default boolean isEmpty() {
    return size() == 0;
  }

  /* ---------- Modification Operations ---------- */

  /** Inserts the specified element into the tree
   *  @return true if the element was inserted successfully */
  boolean add(E element);

  /** Removes the specified element from the tree
   *  @return true if the element was removed successfully */
  boolean remove(E element);

  /* ---------- Traversal Operations ---------- */

  /** Performs an inorder traversal */
  void inorder();

  /** Performs a preorder traversal */
  void preorder();

  /** Performs a postorder traversal */
  void postorder();

  /* ---------- Iteration ---------- */

  @Override
  Iterator<E> iterator();
}

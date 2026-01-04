
package com.jinwang.lab25_4_testbstwithiterator;

import java.util.Iterator;

/**
 *
 * @author jinwang
 */
public abstract class AbstractTree<E> implements Tree<E> {

  /* ---------- Traversal Defaults ---------- */

  @Override
  public void inorder() {
    // Default: do nothing
  }

  @Override
  public void preorder() {
    // Default: do nothing
  }

  @Override
  public void postorder() {
    // Default: do nothing
  }

  /* ---------- State ---------- */

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  /* ---------- Iteration ---------- */

  @Override
  public Iterator<E> iterator() {
    throw new UnsupportedOperationException(
        "Iterator not implemented for this tree");
  }
}

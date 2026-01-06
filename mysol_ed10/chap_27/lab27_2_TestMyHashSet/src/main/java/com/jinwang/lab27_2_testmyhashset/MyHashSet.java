
package com.jinwang.lab27_2_testmyhashset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSet<E> implements MySet<E> {

  private static final int DEFAULT_INITIAL_CAPACITY = 4;
  private static final int MAXIMUM_CAPACITY = 1 << 30;
  private static final float DEFAULT_MAX_LOAD_FACTOR = 0.75f;

  private int capacity;
  private float loadFactorThreshold;
  private int size = 0;

  private LinkedList<E>[] table;

  public MyHashSet() {
    this(DEFAULT_INITIAL_CAPACITY, DEFAULT_MAX_LOAD_FACTOR);
  }

  public MyHashSet(int initialCapacity) {
    this(initialCapacity, DEFAULT_MAX_LOAD_FACTOR);
  }

  public MyHashSet(int initialCapacity, float loadFactorThreshold) {
    capacity = initialCapacity > MAXIMUM_CAPACITY
        ? MAXIMUM_CAPACITY
        : trimToPowerOf2(initialCapacity);

    this.loadFactorThreshold = loadFactorThreshold;
    table = new LinkedList[capacity];
  }

  @Override
  public void clear() {
    size = 0;
    for (int i = 0; i < capacity; i++) {
      if (table[i] != null) {
        table[i].clear();
      }
    }
  }

  @Override
  public boolean contains(E e) {
    int index = hash(e.hashCode());
    if (table[index] != null) {
      for (E element : table[index]) {
        if (element.equals(e)) return true;
      }
    }
    return false;
  }

  @Override
  public boolean add(E e) {
    if (contains(e)) return false;

    if (size + 1 > capacity * loadFactorThreshold) {
      if (capacity == MAXIMUM_CAPACITY)
        throw new RuntimeException("Exceeding maximum capacity");
      rehash();
    }

    int index = hash(e.hashCode());
    if (table[index] == null) {
      table[index] = new LinkedList<>();
    }

    table[index].add(e);
    size++;
    return true;
  }

  @Override
  public boolean remove(E e) {
    int index = hash(e.hashCode());
    if (table[index] != null && table[index].remove(e)) {
      size--;
      return true;
    }
    return false;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public Iterator<E> iterator() {
    return new MyHashSetIterator();
  }

  private class MyHashSetIterator implements Iterator<E> {
    private final ArrayList<E> list = setToList();
    private int current = 0;

    @Override
    public boolean hasNext() {
      return current < list.size();
    }

    @Override
    public E next() {
      return list.get(current++);
    }

    @Override
    public void remove() {
      MyHashSet.this.remove(list.get(--current));
      list.remove(current);
    }
  }

  /* ---------- Hashing Utilities ---------- */

  private int hash(int hashCode) {
    return supplementalHash(hashCode) & (capacity - 1);
  }

  private static int supplementalHash(int h) {
    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
  }

  private int trimToPowerOf2(int initialCapacity) {
    int cap = 1;
    while (cap < initialCapacity) cap <<= 1;
    return cap;
  }

  private void rehash() {
    ArrayList<E> list = setToList();
    capacity <<= 1;
    table = new LinkedList[capacity];
    size = 0;

    for (E e : list) {
      add(e);
    }
  }

  private ArrayList<E> setToList() {
    ArrayList<E> list = new ArrayList<>();
    for (LinkedList<E> bucket : table) {
      if (bucket != null) list.addAll(bucket);
    }
    return list;
  }

  @Override
  public String toString() {
    return setToList().toString();
  }
}

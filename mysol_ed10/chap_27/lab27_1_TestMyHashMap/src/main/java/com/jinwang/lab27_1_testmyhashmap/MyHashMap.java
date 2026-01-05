
package com.jinwang.lab27_1_testmyhashmap;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MyHashMap<K, V> implements MyMap<K, V> {

  private static final int DEFAULT_INITIAL_CAPACITY = 4;
  private static final int MAXIMUM_CAPACITY = 1 << 30;
  private static final float DEFAULT_MAX_LOAD_FACTOR = 0.75f;

  private int capacity;
  private float loadFactorThreshold;
  private int size = 0;

  private LinkedList<MyMap.Entry<K, V>>[] table;

  /** Default constructor */
  public MyHashMap() {
    this(DEFAULT_INITIAL_CAPACITY, DEFAULT_MAX_LOAD_FACTOR);
  }

  /** Construct with initial capacity */
  public MyHashMap(int initialCapacity) {
    this(initialCapacity, DEFAULT_MAX_LOAD_FACTOR);
  }

  /** Construct with initial capacity and load factor */
  @SuppressWarnings("unchecked")
  public MyHashMap(int initialCapacity, float loadFactorThreshold) {
    this.capacity = Math.min(trimToPowerOf2(initialCapacity), MAXIMUM_CAPACITY);
    this.loadFactorThreshold = loadFactorThreshold;
    table = (LinkedList<MyMap.Entry<K, V>>[]) new LinkedList[capacity];
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
  public boolean containsKey(K key) {
    return get(key) != null;
  }

  @Override
  public boolean containsValue(V value) {
    for (LinkedList<MyMap.Entry<K, V>> bucket : table) {
      if (bucket != null) {
        for (MyMap.Entry<K, V> entry : bucket) {
          if (entry.getValue().equals(value)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  @Override
  public Set<MyMap.Entry<K, V>> entrySet() {
    Set<MyMap.Entry<K, V>> set = new HashSet<>();
    for (LinkedList<MyMap.Entry<K, V>> bucket : table) {
      if (bucket != null) {
        set.addAll(bucket);
      }
    }
    return set;
  }

  @Override
  public V get(K key) {
    int index = hash(key.hashCode());
    LinkedList<MyMap.Entry<K, V>> bucket = table[index];
    if (bucket != null) {
      for (MyMap.Entry<K, V> entry : bucket) {
        if (entry.getKey().equals(key)) {
          return entry.getValue();
        }
      }
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public Set<K> keySet() {
    Set<K> set = new HashSet<>();
    for (LinkedList<MyMap.Entry<K, V>> bucket : table) {
      if (bucket != null) {
        for (MyMap.Entry<K, V> entry : bucket) {
          set.add(entry.getKey());
        }
      }
    }
    return set;
  }

  @Override
  public V put(K key, V value) {
    int index = hash(key.hashCode());
    if (table[index] == null) {
      table[index] = new LinkedList<>();
    }

    for (MyMap.Entry<K, V> entry : table[index]) {
      if (entry.getKey().equals(key)) {
        V oldValue = entry.getValue();
        entry.setValue(value);
        return oldValue;
      }
    }

    if (size >= capacity * loadFactorThreshold) {
      rehash();
      index = hash(key.hashCode());
      if (table[index] == null) {
        table[index] = new LinkedList<>();
      }
    }

    table[index].add(new MyMap.Entry<>(key, value));
    size++;
    return value;
  }

  @Override
  public void remove(K key) {
    int index = hash(key.hashCode());
    LinkedList<MyMap.Entry<K, V>> bucket = table[index];
    if (bucket != null) {
      for (MyMap.Entry<K, V> entry : bucket) {
        if (entry.getKey().equals(key)) {
          bucket.remove(entry);
          size--;
          return;
        }
      }
    }
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public Set<V> values() {
    Set<V> set = new HashSet<>();
    for (LinkedList<MyMap.Entry<K, V>> bucket : table) {
      if (bucket != null) {
        for (MyMap.Entry<K, V> entry : bucket) {
          set.add(entry.getValue());
        }
      }
    }
    return set;
  }

  /** Hash function */
  private int hash(int hashCode) {
    return supplementalHash(hashCode) & (capacity - 1);
  }

  /** Supplemental hash function */
  private static int supplementalHash(int h) {
    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
  }

  /** Ensure capacity is power of 2 */
  private int trimToPowerOf2(int initialCapacity) {
    int c = 1;
    while (c < initialCapacity) {
      c <<= 1;
    }
    return c;
  }

  /** Rehash table */
  @SuppressWarnings("unchecked")
  private void rehash() {
    Set<MyMap.Entry<K, V>> entries = entrySet();
    capacity <<= 1;
    table = (LinkedList<MyMap.Entry<K, V>>[]) new LinkedList[capacity];
    size = 0;
    for (MyMap.Entry<K, V> entry : entries) {
      put(entry.getKey(), entry.getValue());
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (LinkedList<MyMap.Entry<K, V>> bucket : table) {
      if (bucket != null) {
        for (MyMap.Entry<K, V> entry : bucket) {
          sb.append(entry);
        }
      }
    }
    sb.append("]");
    return sb.toString();
  }
}

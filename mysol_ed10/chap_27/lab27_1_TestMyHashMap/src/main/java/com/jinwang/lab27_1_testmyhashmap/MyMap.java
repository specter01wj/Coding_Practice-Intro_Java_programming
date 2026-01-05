
package com.jinwang.lab27_1_testmyhashmap;

import java.util.Set;

public interface MyMap<K, V> {

  /** Remove all entries */
  void clear();

  /** Return true if the map contains the specified key */
  boolean containsKey(K key);

  /** Return true if the map contains the specified value */
  boolean containsValue(V value);

  /** Return a set view of the mappings */
  Set<Entry<K, V>> entrySet();

  /** Return the value associated with the key, or null if not found */
  V get(K key);

  /** Return true if the map is empty */
  boolean isEmpty();

  /** Return a set of all keys */
  Set<K> keySet();

  /** Put a key-value pair into the map */
  V put(K key, V value);

  /** Remove the mapping for the specified key */
  void remove(K key);

  /** Return the number of entries */
  int size();

  /** Return a set of all values */
  Set<V> values();

  /** Entry represents a key-value pair */
  class Entry<K, V> {
    private final K key;
    private V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

    public void setValue(V value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "[" + key + ", " + value + "]";
    }

    @Override
    public int hashCode() {
      return key == null ? 0 : key.hashCode();
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Entry<?, ?> e)) return false;
      return key == null ? e.key == null : key.equals(e.key);
    }
  }
}

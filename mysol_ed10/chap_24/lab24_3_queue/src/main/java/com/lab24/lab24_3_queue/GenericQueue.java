/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab24.lab24_3_queue;

/**
 *
 * @author jinwang
 */
public class GenericQueue<E> {
    
    private java.util.LinkedList<E> list = new java.util.LinkedList<E>();

    public void enqueue(E e) {
      list.addLast(e);
    }

    public E dequeue() {
      return list.removeFirst();
    }

    public int getSize() {
      return list.size();
    }

    @Override
    public String toString() {
      return "Queue: " + list.toString();
    }
    
}

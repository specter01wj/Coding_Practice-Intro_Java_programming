/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_7;

/**
 *
 * @author james.wang
 */
public class StackOfIntegers {
    
    private int[] elements;
    private int size;
    public static final int DEF_CAPACITY = 16;

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }
    
    public StackOfIntegers() {
        this(DEF_CAPACITY);
    }
    
    public void push(int value) {
        if(size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    
    public int pop() {
        return elements[--size];
    }
    
    public int peek() {
        return elements[size - 1];
    }
    
    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
    
}

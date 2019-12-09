/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_1;

/**
 *
 * @author james.wang
 */

// GenericStack
public class Lab19_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GenericStack<String> stack1 = new GenericStack<>();
        
    }
    
    public static class GenericStack<E> {
        private java.util.ArrayList<E> list = new java.util.ArrayList<>();
        
        public int getSize() {
            return list.size();
        }
        
        public E peek() {
            return list.get(getSize() - 1);
        }
        
        public void push(E o) {
            list.add(o);
        }
        
        public E pop() {
            E o = list.get(getSize() - 1);
            list.remove(getSize() - 1);
            return o;
        }
        
        public boolean isEmpty() {
            return list.isEmpty();
        }
        
        @Override
        public String toString() {
            return "stack: " + list.toString();
        }
        
    }
    
}

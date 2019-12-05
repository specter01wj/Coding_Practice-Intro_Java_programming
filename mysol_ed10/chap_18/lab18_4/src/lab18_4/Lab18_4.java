/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18_4;

/**
 *
 * @author james.wang
 */

// RecursivePalindrome
public class Lab18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] ant1 = {"moon", "noon", "a", "aba", "ab"};
        for(String i : ant1) {
            System.out.println("is " + i + " a palindrome? - " + isPalindrome(i)); 
        }
    }
    
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }
    
    public static boolean isPalindrome(String s, int low, int high) {
        if(high <= low) {
            return true;
        } else if(s.charAt(low) != s.charAt(high)) {
            return false;
        } else {
            return isPalindrome(s, low + 1, high - 1);
        }
    }
    
}

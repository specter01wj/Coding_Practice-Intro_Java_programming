/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18_3;

/**
 *
 * @author james.wang
 */

// RecursivePalindromeUsingSubstring
public class Lab18_3 {

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
        if(s.length() <= 1) {
            return true;
        } else if(s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        } else {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
    }
    
}

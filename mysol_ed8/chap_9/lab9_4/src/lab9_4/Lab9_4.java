/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_4;

import java.util.Scanner;
/**
 *
 * @author james.wang
 */
public class Lab9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        
        System.out.println("Palidrome check: " + s + " is? " + isPalindrome(s));
    }
    
    public static boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s1);
        
        return s2.equals(s1);
    }
    
    public static String filter(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
    
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        return sb.toString();
    }
    
}

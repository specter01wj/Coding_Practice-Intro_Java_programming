/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_1;

import java.util.Scanner;
/**
 *
 * @author james.wang
 */
public class Lab10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter yearly rate: ");
        double annualIntRate = input.nextDouble();
        
        System.out.println("Enter years: ");
        int numOfYears = input.nextInt();
        
        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();
        
        Loan loan = new Loan(annualIntRate, numOfYears, loanAmount);
        
        System.out.printf("This loan was created on %s\n" + 
            "The monthly payment: %.2f\n" + "The total payment is: %.2f\n", 
            loan.getLoanDate().toString(), loan.getMonthlyPayment(), 
            loan.getTotalPayment());
        
    }
    
}



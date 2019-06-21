/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_1;

import java.util.Date;

/**
 *
 * @author james.wang
 */
public class Loan {
    
    private double annualIntRate, loanAmount;
    private int numOfYears;
    private java.util.Date loanDate;
    
    public Loan() {
        this(2.5, 60, 100000);
    }
    
    public Loan(double annualIntRate, int numOfYears, double loanAmount) {
        this.annualIntRate = annualIntRate;
        this.numOfYears = numOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualIntRate() {
        return annualIntRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getNumOfYears() {
        return numOfYears;
    }

    public void setAnnualIntRate(double annualIntRate) {
        this.annualIntRate = annualIntRate;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setNumOfYears(int numOfYears) {
        this.numOfYears = numOfYears;
    }

    public double getMonthlyPayment() {
        double monthlyIntRate = annualIntRate / 1200;
        double monthlyPayment = loanAmount * monthlyIntRate / (1 - 
                (Math.pow(1 / (1 + monthlyIntRate), numOfYears * 12)));
        return monthlyPayment;
    }
    
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numOfYears * 12;
        return totalPayment;
    }
    
    public java.util.Date getLoanDate() {
        return loanDate;
    }
    
}

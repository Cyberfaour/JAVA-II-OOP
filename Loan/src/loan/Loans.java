/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.util.Date;

/**
 *
 * @author Cyberfaour
 */
public class Loans {
    private double annualRate=2.5;
    private int numberofYears=1;
    private double loanAmount=1000;
    private Date loanDate;
    
    public Loans(){
        
    }
    public Loans(double AnnRate,int nbYears,double Ammount){
        annualRate=AnnRate;
        numberofYears=nbYears;
        loanAmount=Ammount;
        loanDate=new Date();
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }

    public int getNumberofYears() {
        return numberofYears;
    }

    public void setNumberofYears(int numberofYears) {
        this.numberofYears = numberofYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

   public double getMonthlyPayment(){
       double monthlyRate=annualRate/1200;
       double monthlyPayment=loanAmount*monthlyRate/(1-1/Math.pow(1+monthlyRate, numberofYears*12));
       return monthlyPayment;
   }
   public double getTotalPayment(){
       return getMonthlyPayment()*numberofYears*12;
   }
    
    
}

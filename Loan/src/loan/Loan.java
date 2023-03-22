/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class Loan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the interest rate: ");
        double annualIrate=s.nextDouble();
        System.out.println("Enter the number of years as an integer: ");
        int year=s.nextInt();
        System.out.println("Enter the Ammount you want to take: ");
        double ammount=s.nextDouble();
        Loans loan=new Loans(annualIrate,year,ammount);
        System.out.println("\tLoan Details:\nAnual Interest Rate: "+loan.getAnnualRate()+
                            "\nNumber of years: "+loan.getNumberofYears()+"\nAmmount:"+loan.getLoanAmount()
                            +"\nMonthly Payment:$"+loan.getMonthlyPayment()+"\nTotal Payment:"+loan.getTotalPayment()
                            +"\nDate of Creation:"+loan.getLoanDate());
        
    }
    
}

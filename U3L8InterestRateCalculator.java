//Malia Moreno | 21 October 2024//
package com.mycompany.u3l8interestratecalculator;
import java.util.Scanner;

public class U3L8InterestRateCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InterestRateCalculator intRateCalc;
        intRateCalc = new InterestRateCalculator();
        
        double paidSoFar = 0;
        
        //in main ask for user to input a finalncial amount and how many months//
        System.out.print("Please input a financial amount:\t");
        double inMoney = scan.nextDouble();     
        intRateCalc.setTotalAmount(inMoney);
        
        //ask for number of months for repayment//
        System.out.print("How many monts for repayment:\t");
        int inMonths = scan.nextInt();
        intRateCalc.setMonths(inMonths);
        
        //get amount of payment per month//
        for(int i = intRateCalc.getRaminingMonths(); i >0; i--){
            //get monthly payment//
            System.out.println("\nPayment for month "+intRateCalc.getRaminingMonths());
            System.out.println("Montly Payment:\t"+intRateCalc.monthsPay());
            
            //get amount pai so far//
            paidSoFar = paidSoFar + intRateCalc.getMontsPay();
            System.out.println("Amount paid so far:\t"+paidSoFar);
            System.out.println("Amount paid so far:\t"+intRateCalc.getMontsPay());
            
            

        }
        
        
        //System.out.println("Remaining Money:\t"+intRateCalc.getRemainingMoney());
        //System.out.println("Remaining Months:\t"+intRateCalc.getRaminingMonths());
    }
}

class InterestRateCalculator{
    //class should have a public constant called RATE at whatever valeu you choose//
    public final double RATE = 3.5;
    private double monthPay;
    private double remainMoney;
    private int remainMonths;
    
    //set total amount of money and months from user input//
    public void setTotalAmount(double inMoney){
        remainMoney = inMoney;
    }
    public void setMonths(int inMonths){
        remainMonths = inMonths;
    }
    
    //get rate per month//
    public double monthsPay(){
        double intTotal = remainMoney+remainMoney*(RATE*0.01);
        monthPay = Math.round((intTotal/remainMonths)*100.0)/100.0;
        
        //reset remaining money and remaining months//
        remainMoney = remainMoney-monthPay;
        remainMonths = remainMonths-1;
        
        //return months pay//
        return monthPay;
    }
    
    public double RATE(){
        return RATE;
    }
    public double getRemainingMoney(){
        return remainMoney;
    }
    public int getRaminingMonths(){
        return remainMonths;
    }
    public double getMontsPay(){
        return monthPay;
    }
}

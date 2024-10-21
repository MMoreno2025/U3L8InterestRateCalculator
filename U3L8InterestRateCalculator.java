//Malia Moreno | 21 October 2024//
package com.mycompany.u3l8interestratecalculator;
import java.util.Scanner;

public class U3L8InterestRateCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InterestRateCalculator intRateCalc;
        intRateCalc = new InterestRateCalculator();
        
        //in main ask for user to input a finalncial amount and how many months//
        System.out.print("Please input a financial amount:\t");
        double inMoney = scan.nextDouble();     
        intRateCalc.setTotalAmount(inMoney);
        
        //ask for number of months for repayment//
        System.out.print("How many monts for repayment:\t");
        int inMonths = scan.nextInt();
        
        intRateCalc.setFirstMonth(inMonths);
        
        System.out.println("\n\nI Work! | "+intRateCalc.getMonthPay());
    }
}

class InterestRateCalculator{
    //class should have a public constant called RATE at whatever valeu you choose//
    public final double RATE = 3.5;
    private double monthPay;
    private double remainMoney;
    
    public void setTotalAmount(double inMoney){
        remainMoney = inMoney;
    }
    
    public void setFirstMonth(int inMonths){
        double intTotal = remainMoney+remainMoney*(RATE*0.01);
        monthPay = intTotal/inMonths;
        remainMoney = remainMoney-monthPay;
    }
    
    public double RATE(){
        return RATE;
    }
    public double getMonthPay(){
        return monthPay;
    }
    public double getRemainingMoney(){
        return remainMoney;
    }
}

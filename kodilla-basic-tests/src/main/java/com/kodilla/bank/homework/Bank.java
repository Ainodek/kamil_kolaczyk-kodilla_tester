package com.kodilla.bank.homework;

public class Bank {
    private int numbersOfCashMachines;
    CashMachine first = new CashMachine(50000);
    CashMachine second = new CashMachine(100000);
    CashMachine third = new CashMachine(150000);
    public CashMachine[] listOfCashMachines = {first, second, third};
    public int overallBalance(){
        int result = first.getBalance()+ second.getBalance()+ third.getBalance();
        return result;
    }
    public int overallDeposits(){
        int result = first.sumOfDeposits()+ second.sumOfDeposits()+ third.sumOfDeposits();
        return result;
    }
    public int overallWithdraws(){
        int result = first.sumOfWithdraws()+ second.sumOfWithdraws()+ third.sumOfWithdraws();
        return result;
    }
    public int overallNumbersOfDeposits(){
        int result = first.numberOfDeposits()+ second.numberOfDeposits()+third.numberOfDeposits();
        return result;
    }
    public int overallNumbersOfWithdraws(){
        int result = first.numberOfWithdraws()+ second.numberOfWithdraws()+third.numberOfWithdraws();
        return result;
    }
    public double avgDeposits(){
        double result = overallDeposits()/overallNumbersOfDeposits();
        return result;
    }
    public double avgWithdraw(){
        int result = overallWithdraws()/overallNumbersOfWithdraws();
        return result;
    }
}

package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void amountDepositLessThanZero() {
        CashMachine cash = new CashMachine(500000);
        String result1 = cash.deposit(-500001);
        String result2 = cash.withdraw(-1);
        String result3 = cash.withdraw(Integer.MIN_VALUE - 1);
        assertEquals("ERROR", result1);
        assertEquals("ERROR", result2);
        assertEquals("ERROR", result3);
    }

    @Test
    public void amountWithdrawLessThanZero() {
        CashMachine cash = new CashMachine(500000);
        String result1 = cash.withdraw(-500001);
        String result2 = cash.withdraw(-1);
        String result3 = cash.withdraw(Integer.MIN_VALUE - 1);

        assertEquals("ERROR", result1);
        assertEquals("ERROR", result2);
        assertEquals("ERROR", result3);
    }

    @Test
    public void amountWithdrawMoreThanBalance() {
        CashMachine cash = new CashMachine(5000);
        String result1 = cash.withdraw(5001);
        String result2 = cash.withdraw(Integer.MAX_VALUE);
        String result3 = cash.withdraw(5000);
        String result4 = cash.withdraw(0);

        assertEquals("ERROR", result1);
        assertEquals("ERROR", result2);
        assertEquals("succes", result3);
        assertEquals("ERROR", result4);
    }

    @Test
    public void amountDepositMoreThanCapacity() {
        CashMachine cash = new CashMachine(50000);
        String result1 = cash.deposit(100000000);
        String result2 = cash.deposit(99950000);
        String result3 = cash.deposit(99950001);

        assertEquals("ERROR", result1);
        assertEquals("succes", result2);
        assertEquals("ERROR", result3);
    }

    @Test
    public void checkNumberOfDeposits() {
        CashMachine cash = new CashMachine(50000);

        cash.deposit(-1);
        cash.deposit(0);
        cash.deposit(1);
        cash.deposit(100000000);
        cash.deposit(99950000);
        cash.deposit(99949999);

        int result = cash.numberOfDeposits();

        assertEquals(2, result);
    }

    @Test
    public void checkNumbersOfWithdraw() {
        CashMachine cash = new CashMachine(50000);

        cash.withdraw(-1);
        cash.withdraw(0);
        cash.withdraw(1);
        cash.withdraw(49999);
        cash.withdraw(1);

        int result = cash.numberOfWithdraws();
        assertEquals(2, result);
    }
    @Test
    public void checkAmountInCashMachine(){

        //Before
        CashMachine cash1= new CashMachine(50000);
        CashMachine cash2= new CashMachine(50000);
        CashMachine cash3= new CashMachine(50000);
        CashMachine cash4= new CashMachine(50000);
        //Test with no operation
        int result1 = cash1.checkBalanceThisMachine();
        assertEquals(50000, result1);

        //Test with incorrect withdraw
        cash2.withdraw(-1);
        cash2.withdraw(0);
        cash2.withdraw(50001);

        int result2 = cash2.checkBalanceThisMachine();
        assertEquals(50000, result2);

        //Test with correct and incorrect withdraw
        cash3.withdraw(1);
        cash3.withdraw(50000);

        int result3 = cash3.checkBalanceThisMachine();
        assertEquals(49999, result3);

        //Test with correct and incorrect operations
        cash4.withdraw(20);
        cash4.deposit(40);
        cash4.deposit(-1);
        cash4.deposit(0);

        int result4 = cash4.checkBalanceThisMachine();
        assertEquals(50020, result4);
    }
    @Test
    public void checkNumberOfTransations(){
        CashMachine cash1 = new CashMachine(50000);
        CashMachine cash2 = new CashMachine(50000);

        int result1 = cash1.numberOfTransactions();
        assertEquals(0, result1);

        cash1.deposit(50000);
        cash1.withdraw(100000);
        cash1.deposit(2);
        cash1.withdraw(5);

        int result2 = cash1.numberOfTransactions();
        assertEquals(3, result2);

        cash2.withdraw(-1);
        cash2.deposit(-1);
        cash2.withdraw(0);
        cash2.deposit(0);
        cash2.withdraw(100000);

        int result3 = cash2.numberOfTransactions();
        assertEquals(0, result3);
    }
    @Test
    public void checkBalance(){
        CashMachine cash1 = new CashMachine(50000);

        int result1 = cash1.getBalance();
        assertEquals(0, result1);

        cash1.withdraw(0);
        cash1.withdraw(-1);
        cash1.withdraw(50001);
        cash1.withdraw(50000);
        cash1.deposit(100000001);
        cash1.deposit(100000000);
        cash1.deposit(1);

        int result2 = cash1.getBalance();
        assertEquals(99950000, result2);
    }
    @Test
    public void checkSumOfWithdraws(){
        CashMachine cash1 = new CashMachine(50000);

        int result = cash1.sumOfWithdraws();
        assertEquals(0, result);

        cash1.withdraw(0);
        cash1.withdraw(-1);
        cash1.withdraw(50001);
        cash1.withdraw(5000);
        cash1.withdraw(100);
        cash1.deposit(100000);
        cash1.withdraw(50);

        int result1 = cash1.sumOfWithdraws();
        assertEquals(5150, result1);
    }
    @Test
    public void checkSumOfDeposits(){
        CashMachine cash1 = new CashMachine(50000);

        int result = cash1.sumOfDeposits();
        assertEquals(0, result);

        cash1.withdraw(10);
        cash1.deposit(0);
        cash1.deposit(-1);
        cash1.deposit(100000000);
        cash1.deposit(99950000);
        cash1.deposit(1);
        cash1.withdraw(100000000);
        cash1.deposit(10);

        int result1 = cash1.sumOfDeposits();
        assertEquals(99950001, result1);
    }
}

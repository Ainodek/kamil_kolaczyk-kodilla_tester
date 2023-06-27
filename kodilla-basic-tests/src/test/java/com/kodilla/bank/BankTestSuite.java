package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void checkNumbersOfWithdraws(){
        //Before
        CashMachine first = new CashMachine(50000);
        CashMachine second = new CashMachine(100000);
        CashMachine third = new CashMachine(150000);

        //Test 1 - no operation
        Bank bank1 = new Bank();
        int result1 = bank1.overallNumbersOfWithdraws();
        assertEquals(0, result1);

        //Test 2 - operation in 3 objects - 3 incorect and 1 correct each
        first.withdraw(50001);
        first.withdraw(0);
        first.withdraw(-1);
        first.withdraw(1);

        second.withdraw(100001);
        second.withdraw(0);
        second.withdraw(-1);
        second.withdraw(1);

        third.withdraw(150001);
        third.withdraw(0);
        third.withdraw(-1);
        third.withdraw(1);

        Bank bank2 = new Bank();
        int result2 = bank2.overallNumbersOfWithdraws();
        assertEquals(3, result2);
    }
    @Test
    public void checkNumbersOfDeposits(){
        //Before
        CashMachine first = new CashMachine(50000);
        CashMachine second = new CashMachine(100000);
        CashMachine third = new CashMachine(150000);

        //Test 1 - no operation
        Bank bank1 = new Bank();
        int result1 = bank1.overallNumbersOfDeposits();
        assertEquals(0, result1);

        //Test 2
        first.deposit(20000);
        first.deposit(0);
        first.deposit(-1);
        first.deposit(100000000);

        second.deposit(20000);
        second.deposit(0);
        second.deposit(-1);
        second.deposit(100000000);

        third.deposit(20000);
        third.deposit(0);
        third.deposit(-1);
        third.deposit(100000000);

        Bank bank2 = new Bank();
        int result2 = bank2.overallNumbersOfDeposits();
        assertEquals(3, result2);
    }
    @Test
    public void chechOverallBalance(){
        //Before
        CashMachine first = new CashMachine(50000);
        CashMachine second = new CashMachine(100000);
        CashMachine third = new CashMachine(150000);
        Bank bank = new Bank();
        //Make some operations
        first.withdraw(10000);
        second.deposit(20000);
        third.withdraw(0);
        first.deposit(-1);
        second.withdraw(130000);
        third.deposit(100000000);
        //Test
        int result = bank.overallBalance();
        assertEquals(10000, result);
    }
    @Test
    public void sumOverallAmountDeposite(){
        //Before
        CashMachine first = new CashMachine(50000);
        CashMachine second = new CashMachine(100000);
        CashMachine third = new CashMachine(150000);
        Bank bank = new Bank();
        //Make some operations
        first.withdraw(10000);
        second.deposit(20000);
        third.withdraw(0);
        first.deposit(-1);
        second.withdraw(130000);
        third.deposit(100000000);
        //Test
        int result = bank.overallDeposits();
        assertEquals(20000, result);
    }
    @Test
    public void sumOverallAmountWithdraws(){
        //Before
        CashMachine first = new CashMachine(50000);
        CashMachine second = new CashMachine(100000);
        CashMachine third = new CashMachine(150000);
        Bank bank = new Bank();
        //Make some operations
        first.withdraw(10000);
        second.deposit(20000);
        third.withdraw(0);
        first.deposit(-1);
        second.withdraw(130000);
        third.deposit(100000000);
        //Test
        int result = bank.overallWithdraws();
        assertEquals(10000, result);
    }
    @Test
    public void chechAvgDeposits(){
        //Before
        CashMachine first = new CashMachine(50000);
        CashMachine second = new CashMachine(100000);
        CashMachine third = new CashMachine(150000);
        Bank bank = new Bank();
        //Make some operations
        first.withdraw(10000);
        second.deposit(20000);
        third.withdraw(0);
        first.deposit(-1);
        second.withdraw(130000);
        third.deposit(100000000);
        //Test
        double result = bank.avgDeposits();
        assertEquals(20000, result);
    }
    @Test
    public void chechAvgWithdraws(){
        //Before
        CashMachine first = new CashMachine(50000);
        CashMachine second = new CashMachine(100000);
        CashMachine third = new CashMachine(150000);
        Bank bank = new Bank();
        //Make some operations
        first.withdraw(10000);
        second.deposit(20000);
        third.withdraw(0);
        first.deposit(-1);
        second.withdraw(130000);
        third.deposit(100000000);
        //Test
        double result = bank.avgWithdraw();
        assertEquals(10000, result);
    }
}

package com.kodilla.bank.homework;

public class CashMachine {

    private String succes = "succes";
    private String error = "ERROR";
    private final int minCash = 0; //min value of cash
    private final int maxCash = 100000000; //max capacity
    private int cash; //cash in new Cash Machine
    private int[] balance = new int[0];
    private int size = 0;

    public CashMachine(int cash) {
        this.cash = cash;
    }

    public int checkBalanceThisMachine() {
        int temp = this.cash;
        if (this.size == 0) {
            return cash;
        } else {

            for (int i = 0; i < balance.length; i++) {
                temp += balance[i];
            }
        }
        return temp;
    }
    public String deposit(int amount) {
        if (amount <= 0) {
            System.out.println("deposit " + error);
            return error;
        } else if (amount > 0) {
            int temp = checkBalanceThisMachine();
            if (temp + amount > maxCash) {
                System.out.println("deposit " + error);
                return error;
            }
        }
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(balance, 0, newTab, 0, balance.length);
            newTab[this.size - 1] = amount;
            this.balance = newTab;
            System.out.println("deposit " + succes);
            return succes;

    }
    public String withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("deposit " + error);
            return error;
        }
        if (amount > 0) {
            int temp = checkBalanceThisMachine();
            if (temp - amount < minCash) {
                System.out.println("withdraw " + error);
                return error;
            }
        }


        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(balance, 0, newTab, 0, balance.length);
        newTab[this.size - 1] -= amount;
        this.balance = newTab;
        System.out.println("withdraw " + succes);
        return succes;
    }

    public int numberOfTransactions() {
        return balance.length;
    }

    public int getBalance() {
        int result = 0;
        for (int i = 0; i < balance.length; i++) {
            result += balance[i];
        }
        return result;
    }

    public void listOfDeposits() {
        for (int i = 0; i < balance.length; i++) {
            if (balance[i] > 0) {
                System.out.println(balance[i]);
            }
        }
    }

    public void listOfWithdraw() {
        for (int i = 0; i < balance.length; i++) {
            if (balance[i] < 0) {
                System.out.println(balance[i]);
            }
        }
    }

    public int sumOfDeposits() {
        int sum = 0;
        for (int i = 0; i < balance.length; i++) {
            if (balance[i] > 0) {
                sum += balance[i];
            }
        }
        return sum;
    }

    public int sumOfWithdraws() {
        int sum = 0;
        for (int i = 0; i < balance.length; i++) {
            if (balance[i] < 0) {
                sum -= balance[i];
            }
        }
        return sum;
    }

    public int numberOfDeposits() {
        int number = 0;
        for (int i = 0; i < balance.length; i++) {
            if (balance[i] > 0) {
                number++;
            }
        }
        return number;
    }

    public int numberOfWithdraws() {
        int number = 0;
        for (int i = 0; i < balance.length; i++) {
            if (balance[i] < 0) {
                number++;
            }
        }
        return number;
    }
}

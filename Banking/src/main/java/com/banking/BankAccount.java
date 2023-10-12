package com.banking;


public class BankAccount {

    public long accountNumber= 0;
    public double balance= 0 ;


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long ac){
        this.accountNumber = ac;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount){
        this.balance = amount;
    }


    public void deposit(double amount){
        this.balance += amount;
    }

    public void  withdraw(double amount){
        if(amount > balance){
           System.out.println("No sufficient balance !!") ;
        }else{
            this.balance -= amount;
        }
    }

}

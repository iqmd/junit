package com.banking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {


    static BankAccount bankAccount;

    @BeforeEach
    public void setUpBeforeEachTest(){
         bankAccount = new BankAccount();
         bankAccount.setBalance(10000);;
    }

    @Test
    public void depositTest(){
        bankAccount.deposit(2000);
        assertEquals(12000, bankAccount.getBalance());

    }

    @Test
    public void withdrawTest(){
        bankAccount.withdraw(200);
        assertEquals(9800,bankAccount.getBalance());
    }

    @Test
    public void withdrawTestForInsufficientBalance(){
        bankAccount.withdraw(12000);
        assertEquals(10000,bankAccount.getBalance());
    }

    @Test
    public void checkBalanceTest(){
        assertEquals(10000,bankAccount.getBalance());
    }

}

package com.banking;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BankTest{

    static BankClass somebank;
    static ArrayList<BankAccount> accounts;

    @BeforeAll
    static void inits(){
         somebank = new BankClass();

    }


    @Test
    public void createAccountTest(){
        somebank.createAccount();
        ArrayList<BankAccount> newaccounts = somebank.getAllAccounts();
        assertNotEquals(0, newaccounts.size());
    }


    @Test
    public void totalBalanceTest(){
        somebank.createAccount();
        somebank.createAccount();
        somebank.createAccount();
        somebank.getAccount(1).setBalance(10000);
        somebank.getAccount(2).setBalance(2400);
        somebank.getAccount(3).setBalance(200);

        assertEquals(12600,somebank.getTotalBalance());
    }




}

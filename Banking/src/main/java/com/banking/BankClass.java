package com.banking;

import java.util.ArrayList;
import java.util.HashMap;

public class BankClass {

    private long uniq = 0;
    HashMap<Long, BankAccount> accounts = new HashMap<>();

    public void createAccount(){
       BankAccount account = new BankAccount();
       uniq += 1;
       account.setAccountNumber(uniq);
       accounts.put(uniq,account);
    }

    public BankAccount getAccount(long ac){
        return accounts.get(ac);
    }

    public ArrayList<BankAccount> getAllAccounts(){
        ArrayList<BankAccount> allAccounts= new ArrayList<>();

        for(BankAccount acc: accounts.values()){
           allAccounts.add(acc) ;
        }

        return allAccounts;
    }

    public double getTotalBalance(){
        double totalAmount=0;
        for(BankAccount acc: accounts.values()){
           totalAmount += acc.getBalance();
        }

        return totalAmount;
    }

}

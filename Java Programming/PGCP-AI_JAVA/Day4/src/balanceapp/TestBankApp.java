package balanceapp;

import balanceapp.exception.AccountNotFoundException;
import balanceapp.exception.MinimumBalanceException;

public class TestBankApp {
    public static void main(String[] args) throws MinimumBalanceException, AccountNotFoundException {
        BankApp ba=new BankApp();
        ba.menu();
    }
}


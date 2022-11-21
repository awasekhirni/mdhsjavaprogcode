package myfirstproject.src;

import myfirstproject.BankAccount;
import myfirstproject.CurrentAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import myfirstproject.BankAccount;

public class BankMain {

    // entry point
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BankAccount tdbank = new BankAccount("Mr.Rayyan", 873366, 5000.00);
        tdbank.getAccountBalance();
        tdbank.depositAmount();
        tdbank.showStatement();

        CurrentAccount ca = new CurrentAccount("Mr.Rayyan", 873366, 5000.00, 1000.00, false);
        ca.withdrawAmount();
        System.out.println("the penalty to be paid is:" + ca.checkPenalty());

    }

}

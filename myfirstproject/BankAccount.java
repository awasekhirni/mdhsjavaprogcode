package myfirstproject;

//builtin library
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

//Base Class
public class BankAccount {

    // restrict access from public view
    // access modifiers // encapsulation
    // public => scope - public any body and everybody can view and access
    // private => scope is restricted
    // create an instance of the scanner to scan the input from the terminal
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int accountNumber;
    private double accountBalance;

    // build our constructor
    public BankAccount(String aname, int accNumber, double accBalance) {
        this.name = aname;
        this.accountNumber = accNumber;
        this.accountBalance = accBalance;

    }

    // getter
    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    // setter
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Additional State Operations
    public void depositAmount() {
        System.out.println("Your account Balance is:" + this.accountBalance);
        System.out.println("Please enter the amount to deposit:");
        double iAmount = scanner.nextDouble();// input from user;
        this.accountBalance = this.accountBalance + iAmount;
        System.out.println("The Current Balance post depoist is:" + this.accountBalance);
    }

    public void withdrawAmount() {
        System.out.println("Please enter the Amount you would like to withdraw:");
        double iAmount = scanner.nextDouble();
        this.accountBalance = this.accountBalance - iAmount;
        System.out.println("The current balance post withdrawal is:" + this.accountBalance);
    }

    public void showStatement() {
        System.out.println("Your Account Statement Today is:");
        System.out.println("Account Funds Available are:" + this.accountBalance);
    }

}

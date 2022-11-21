package myfirstproject;

//Derived class // child class // Return on your Investment
public class SavingsAccount extends BankAccount {

    // compute ROI
    private double roi = 5.75;

    public SavingsAccount(String aname, int accNumber, double accBalance, double broi) {
        super(aname, accNumber, accBalance);

        this.roi = broi;
    }

    public double computeInterestEarned() {
        // fetch the current account balance
        double earnedinterestAmount = (super.getAccountBalance() * roi) / 100;
        System.out.println("The Interest earned on:" + super.getAccountBalance() + "is: " + earnedinterestAmount);
        return earnedinterestAmount;
    }

}

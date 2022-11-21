package myfirstproject;

//inheritance 
//child class or derived class
public class CurrentAccount extends BankAccount {

    // additional properties
    private double minimumBalance = 500.00; // default value
    private boolean checkBook = false;// default boolean value

    public CurrentAccount(String aname, int accNumber, double accBalance, double mBalance, boolean cbook) {
        super(aname, accNumber, accBalance);

        this.minimumBalance = mBalance;
        this.checkBook = cbook;
    }

    // operations/functions
    public boolean checkBookStatus() {
        if (checkBook == true) {
            System.out.println("Cheque book has been issued!" + "/n");
            return true;

        } else {
            System.out.println("Cheque book has not been issued!");
            return false;
        }
    }

    // if checkbook not issue please issue a checkbook
    public void issueNewCheckBook() {
        checkBook = true;
        System.out.println("Chequebook has been issued successfully!");
    }

    // define penalty if the value is below 500
    public double checkPenalty() {
        if (super.getAccountBalance() <= this.minimumBalance) {
            return 25.00;
        } else {
            return 0.0;
        }
    }

}

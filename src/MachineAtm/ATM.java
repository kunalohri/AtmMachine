package MachineAtm;

public class ATM {

    private double balance;
    private double depositeAmount;
    private double withdrawAmount;

    // Default Constractor

    public ATM(){

    }

    // getter and setter methods


    // getters

    public double getBalance() {
        return balance;
    }

    public double getDepositeAmount() {
        return depositeAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    // setters


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDepositeAmount(double depositeAmount) {
        this.depositeAmount = depositeAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}

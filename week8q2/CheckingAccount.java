package week8q2;

public class CheckingAccount{
    private double balance;
    private int accNumber;
    
    public CheckingAccount() {
        this.balance = 0;
        this.accNumber = 0;
    }
    
    public void deposit(double amount) throws Exception {
        if(amount > 0) {
            balance += amount;
        }
        else {
            throw new Exception("Deposit amount should be non-negative");
        }
    }
    
    public boolean withdraw(double amount) throws Exception {
        if(balance - amount < 0) {
            throw new InsufficientFundsExceptions(balance - amount);
        }
        else if(amount < 0) {
            throw new Exception("Withdraw amount should be non-negative");
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }
}

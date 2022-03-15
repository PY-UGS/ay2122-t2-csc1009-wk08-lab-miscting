package week8q2;

public class CheckingAccount{
    private double balance;
    private int accNumber;
    
    public CheckingAccount() {
        this.balance = 0;
        this.accNumber = 0;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public boolean withdraw(double amount) throws InsufficientFundsExceptions {
        if(balance - amount < 0) {
            throw new InsufficientFundsExceptions(balance - amount);
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

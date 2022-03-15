package week8q2;
import java.util.Scanner;

public class BankDemoTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        CheckingAccount account1 = new CheckingAccount();
        try{
            System.out.print("Deposit amount: $");
            account1.deposit(input.nextDouble());
            System.out.print("Withdraw amount: $");
            
            if(account1.withdraw(input.nextDouble()) == true) {
                System.out.println("Balance after withdraw: $" + account1.getBalance());
            }
            
        }
        catch(InsufficientFundsExceptions ife) {
            System.out.println("Sorry, but your account is short by: $" + Math.abs(ife.getAmount()));
        }
        finally {
            input.close();
        }
    }
}

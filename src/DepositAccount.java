import java.util.Scanner;

public class DepositAccount extends Account implements Withdrawable{
    public DepositAccount(int IBAN , int balance , int monthlyInterestRate) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.typeOfAccount = "Deposit account";
    }




    @Override
    public void withdraw(int amount) {
        if (balance > 0) {
            this.balance -= amount;
            System.out.println("You successfully withdrawn " + amount + "$");
            System.out.println("Current balance: "+balance+"$");
        } else {
            System.out.println("You don't have enough $ to proceed the transaction.");
            System.out.println("Current balance: "+balance+"$");
        }
    }

}

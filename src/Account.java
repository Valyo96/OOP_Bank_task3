import java.util.Scanner;
import java.util.StringJoiner;

public abstract class Account implements Depositable , Valueable , Withdrawable{
    protected String typeOfAccount;
    protected int IBAN;
    protected int balance;
    protected int monthlyInterestRate;

    public int getIBAN() {
        return IBAN;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    @Override
    public int getValueOfInterestRateForPeriod(int period , Customer owner){

        if(owner instanceof IndividualCustomer){
            return (this.balance * (this.monthlyInterestRate/100)) * (period - 6);
        }else {
            int forEachMonth = (this.balance * (monthlyInterestRate/100));
            if(period<=12){
                return (int) (forEachMonth * 0.5 * period);
            } else {
                int remainder = period  - 12;
                return (int) (((forEachMonth*0.5) * 12) + forEachMonth * remainder);
            }
        }
    }
    @Override
    public void deposit(int amount){
        this.balance+=amount;
        System.out.println("New balance after the deposit: "+balance+"$");
    }

    @Override
    public String toString() {
        return "----------Account details----------\r\n" +
                "IBAN: "+IBAN+"\r\n" +
                "Balance: "+balance+"\r\n";
    }
}

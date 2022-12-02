public class LoanAccount extends Account {
    public LoanAccount(int IBAN , int balance , int monthlyInterestRate) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.typeOfAccount = "Loan account";
    }


    @Override
    public void withdraw(int amount) {
        System.out.println("You can't withdraw from this account!!");
    }
}
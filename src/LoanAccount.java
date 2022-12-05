public class LoanAccount extends Account {
    public LoanAccount(int IBAN , int balance , int monthlyInterestRate) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.typeOfAccount = "Loan account";
    }



}
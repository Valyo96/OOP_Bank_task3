public class MortgageAccount extends Account{
    public MortgageAccount(int IBAN , int balance , int monthlyInterestRate) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.typeOfAccount = "Mortgage account";
    }


}

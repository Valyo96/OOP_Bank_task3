import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Factory {

    public static Customer customerFactory(String name , String password , int choice){
        Customer customer = null;
        switch (choice){
            case 1 -> customer=new IndividualCustomer(name ,password);
            case 2 -> customer=new CompanyCustomer(name ,password);
        }
        return customer;
    }


    public static Account accountFactory(int choice , int balance , int monthlyInterestRate){
        Account account = null;
        Random ibanGenerator = new Random();
        int IBAN = ibanGenerator.nextInt(10000000 , 99999999);
        switch (choice){
            case 1 -> account=new DepositAccount(IBAN , balance , monthlyInterestRate);
            case 2 -> account=new LoanAccount(IBAN ,  balance , monthlyInterestRate);
            case 3 -> account= new MortgageAccount(IBAN ,  balance , monthlyInterestRate);
        }
        return account;
    }

    public static Bank bankFactory(String name , List<Customer> customers){
        return new Bank(name , customers);
    }
}

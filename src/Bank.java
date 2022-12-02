import java.util.List;
import java.util.StringJoiner;

public class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name, List<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }



    public Account openAccount(Customer customer){
        Menu.createAccountMenu();
        int choice = UserInput.numeralInput();
        System.out.print("Please put amount of money into your account: ");
        int balance = UserInput.numeralInput();
        System.out.println();
        System.out.print("Select interest rate(to tva e typo , choveka sam da si izbira :D): ");
        int interestRate = UserInput.numeralInput();
        Account newAccount = Factory.accountFactory(choice  , balance , interestRate);
        customer.addAccountToList(newAccount);
        return newAccount;
    }

    @Override
    public String toString() {
        return "---------------"+name+" Bank--------------\r\n" +
                "All customers ->\r\n" +
                customers;
    }
}

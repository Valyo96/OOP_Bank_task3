import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        Bank bank = new Bank("Draining your money", customers);
        while (true) {
            Customer client = null;
            System.out.println(bank.getName().toString() + " BANK");
            Menu.loginMenu();
            int choice = UserInput.numeralInput();
            if (choice == 1) {
                System.out.print("Enter your name: ");
                String clientName = UserInput.textInput();
                String fake = UserInput.textInput();
                System.out.println();
                System.out.print("Enter your password: ");
                String clientPassword = UserInput.textInput();
                if (customers.size() != 0) {
                    for (Customer customer : customers) {
                        if (customer.getName().equals(clientName) && customer.getPassword().equals(clientPassword)) {
                            client = customer;
                            System.out.println("You logged in into your account.");
                            while (true) {
                                Menu.printMainMenu();
                                int choice2 = UserInput.numeralInput();
                                if (choice2 == 1) {
                                    Account acc = bank.openAccount(client);

                                    System.out.println("You have successfully opened " + acc.getTypeOfAccount());
                                } else if (choice2 == 2) {
                                    int sizeOfAccList = client.getAccountList().size();
                                    if (sizeOfAccList <= 0) {
                                        System.out.println("You don't have account. Please open one if you want to proceed.");
                                    } else {
                                    int i=1;
                                        System.out.println("Available accounts to deposit----> ");
                                    for (Account account : client.getAccountList()) {
                                        System.out.println(i+"."+account.getTypeOfAccount());
                                        i++;
                                    }
                                        int choose = UserInput.numeralInput();
                                        System.out.println();
                                        System.out.print("Enter amount: ");
                                        client.getAccountList().get(choose - 1).deposit(UserInput.numeralInput());
                                    }

                                } else if (choice2 == 3) {
                                    for (Account account : client.getAccountList()) {
                                        if (account instanceof DepositAccount) {
                                            System.out.print("Amount of money to withdraw: ");
                                            ((DepositAccount) account).withdraw(UserInput.numeralInput());
                                        }

                                    }

                                } else if (choice2 == 4) {
                                    System.out.println("You logged out.");
                                    break;
                                } else if (choice2 == 5) {
                                    System.exit(0);
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Wrong name or password!\r\n");
                }
            }
            if (choice == 2) {
                Menu.createCustomerMenu();
                int choice2 = UserInput.numeralInput();
                if (choice2 == 1) {
                    System.out.print("Please register your name-> ");
                    String name = UserInput.textInput();
                    String fake = UserInput.textInput();
                    System.out.println();
                    System.out.print("Please enter password-> ");
                    String pass = UserInput.textInput();
                    System.out.println();
                    customers.add(new IndividualCustomer(name, pass));
                    System.out.println("Successful registration");
                } else if (choice2 == 2) {
                    System.out.print("Please register your name-> ");
                    String name = UserInput.textInput();
                    System.out.println();
                    String fake = UserInput.textInput();
                    System.out.print("Please enter password-> ");
                    String pass = UserInput.textInput();
                    System.out.println();
                    customers.add(new CompanyCustomer(name, pass));
                    System.out.println("Successful registration");
                }
            } else if (choice == 3) {
                System.exit(0);
            }
        }


    }
}
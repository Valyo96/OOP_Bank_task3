import java.util.List;

public class Menu {
    public static void printMainMenu(){
        System.out.println(
                "1.Open account\r\n" +
                "2.Deposit\r\n" +
                "3.Withdraw\r\n" + "4.Log out\r\n"+
                "5.Exit\r\n");
    }

    public static void createCustomerMenu(){
        System.out.println("1.Individual customer\r\n" +
                "2.Company customer\r\n");
    }

    public static void createAccountMenu(){
        System.out.println("1.Deposit account\r\n" +
                "2.Loan account\r\n" +
                "3.Mortgage account\r\n");
    }

    public static void loginMenu(){
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("3.Exit");

    }
}

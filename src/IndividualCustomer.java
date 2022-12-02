import java.util.ArrayList;
import java.util.List;

public class IndividualCustomer extends Customer{
    public IndividualCustomer(String name, String password) {
        this.name = name;
        this.password = password;
        this.accountList = new ArrayList<>();
    }
}

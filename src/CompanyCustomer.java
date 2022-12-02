import java.util.ArrayList;
import java.util.List;

public class CompanyCustomer extends Customer{
    public CompanyCustomer(String name ,String password ) {
        this.name = name;
        this.password = password;
        this.accountList = new ArrayList<>();
    }
}

import java.util.List;

public abstract class Customer {
    protected List<Account> accountList;
    protected String name;

    protected String password;

    public List<Account> getAccountList() {
        return accountList;
    }

    public void addAccountToList(Account account){
        this.accountList.add(account);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
}

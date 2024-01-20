package Classes;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts;

    public Bank()
    {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account)
    {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

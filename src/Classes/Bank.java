package Classes;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts = new ArrayList<>();

    void addAccount(Account account)
    {
        accounts.add(account);
    }

}

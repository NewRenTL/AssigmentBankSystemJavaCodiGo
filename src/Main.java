import Classes.Account;
import Classes.Bank;
import Classes.CurrentAccount;
import Classes.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();

        System.out.println();
        System.out.println("Adding Accounts");
        Account a1 = new CurrentAccount("Diego",200);
        Account a2 = new SavingsAccount("Micaela",300);

        //Adding accounts  (One currentAccount and SavingsAccount)
        b1.addAccount(a1);
        b1.addAccount(a2);

        for(Account a:b1.getAccounts())
        {
            a.showInformation();
            System.out.println("Current Bank Interest:"+a.calculateInterest());
        }

        System.out.println();
        System.out.println("Depositing 400 dollars to all accounts");
        //Depositing money
        for(Account a:b1.getAccounts())
        {
            a.deposit(400);
            a.showInformation();
            System.out.println("Current Bank Interest:"+a.calculateInterest());
        }

        System.out.println();
        System.out.println("BankWithdrawals");
        System.out.println("Withdrawing 200$ dollars to all accounts");
        for (Account a:b1.getAccounts())
        {
            a.withdraw(200);
            a.showInformation();
            System.out.println("Current Bank Interest:"+a.calculateInterest());
        }

        System.out.println();
        System.out.println("Additional Method of SavingAccount:");
        System.out.println("Calculate InterestRate for SavingsAccount only:");

        for (Account a:b1.getAccounts())
        {
            if(a instanceof SavingsAccount){
                SavingsAccount savingsAccounttemp = (SavingsAccount) a;

                savingsAccounttemp.showInformation();
                System.out.println("Using my additional method to calculate my interest, I get: "+
                        savingsAccounttemp.calculateInterestRate(0.10,5) +" in interest");
            }
        }

    }
}
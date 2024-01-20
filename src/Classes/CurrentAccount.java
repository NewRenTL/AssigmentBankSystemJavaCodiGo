package Classes;

public class CurrentAccount implements Account{

    private String name;
    private double amount;


    public CurrentAccount(String name,double amount) {
        this.name = name;
        this.amount = amount;
    }

    public CurrentAccount(String name)
    {
        this.name = name;
        this.amount = 0;
    }

    @Override
    public void deposit(double amount) {
        this.amount += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(this.amount - amount < 0)
        {
            System.out.println("You don't have enough amount to withdraw that money");
        }
        else {
            this.amount -= amount;
            System.out.println("Your money withdrawal $"+amount+" was successfully");
        }
    }

    @Override
    public double calculateInterest() {
        return amount*0.05*4;
    }

    public void showInformation()
    {
        System.out.println("My name is "+name+". I have $"+amount+" currently in my currentAccount");
    }
}

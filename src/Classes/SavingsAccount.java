package Classes;

public class SavingsAccount implements Account{

    private double amount;
    private String name;
    public SavingsAccount(String name,double amount)
    {
        this.name = name;
        this.amount = amount;
    }

    public SavingsAccount(String name)
    {
        this.name =name;
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
        return amount*0.05*3;
    }

    @Override
    public void showInformation() {
        System.out.println("My name is "+name+". I have $"+amount+" currently in my SavingsAccount");
    }

    public double calculateInterestRate(double interestRate, int temp_periods)
    {
        return this.amount*interestRate*temp_periods;
    }                   
}

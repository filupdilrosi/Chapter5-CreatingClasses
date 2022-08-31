package Chapters5BuildingClasses.bankAccountMethodDecs;
//Represents a bank account with basic services such as deposit and withdraw
import java.text.NumberFormat;
public class BankAccounts {
    private final double RATE = 0.035; //3.5 percent interest rate
    private String name;
    private long acctNumber;
    private double balance;
    //
    // Sets up this account with the specified owner, account number, and initial balance
    //
    public BankAccounts(String owner, long account, double initial)
    {
        name=owner;
        acctNumber = account;
        balance = initial;
    }
    //
    //Deposits the specified amount into this account and returns the new balance.
    //The balance is not modified if the deposit amount is invalid
    //
    public double deposit(double amount)
    {
        if (amount>0)
            balance += amount;
        return balance;
    }
    //
    //Withdraws the specified amount and fee from this account and returns
    //the new balance. The balance is not modified if the withdraw amount is invalid or balance insufficient
    //
    public double withdraw(double amount, double fee)
    {
        if(amount+fee>0 && amount+fee < balance)
            balance= balance- amount - fee;
        return balance;
    }
    //Adds interest to this account and returns new balance
    public double addInterest()
    {
        balance+=(balance*RATE);
        return balance;
    }
    //Return current balance of the account
    public double getBalance()
    {
        return balance;
    }
    //returns a one line description of this account as a string
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (acctNumber + "\t" + name + "\t" +fmt.format(balance));
    }
}

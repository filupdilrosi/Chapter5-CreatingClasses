package Chapters5BuildingClasses.bankAccountMethodDecs;
////Demonstrates the creation and use of multiple account Objects, This is a driver class!!!
public class Transactions {
    //Create some bank accounts and request various services
    public static void main(String[] args) {
        BankAccounts acct1 = new BankAccounts("Ted Murphy", 72354, 25.59);
        BankAccounts acct2 = new BankAccounts("Angela Murphy", 69713, 500.00);
        BankAccounts acct3 = new BankAccounts("Edward Murphy", 93757, 769.32);

        acct1.deposit(44.10); //return value ignored

        double angelasBalance = acct2.deposit(75.25);
        System.out.println("Angela's balance after withdrawal: " + acct2.withdraw(480, 1.50));
        acct3.withdraw(-100.00,1.50); //Invalid transaction

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}

package bankingapplication1;

public class Account {
    String AccountName;
    int AccountNumber;
    double Balance;

    Account (int AccountNumber,String AccountName , double Balance) {
        this.AccountName = AccountName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public void deposit(double amount) {
        Balance += amount;
    }

    public void withdraw(double amount) {
        Balance -= amount;
    }

    public int getNumber() {
        return AccountNumber;
    }
    public String getName() {
        return AccountName;
    }

    public double getBalance() {
        return Balance;
    }

}

package Vjezba1911.ENKAPSULACIJA;

enum AccountType{
    BUSSINESS, PRIVATE
}
public class Account {
    private int accNumber;
    private int balance;
    private AccountType type;
    public Account(int accNumber, int balance, AccountType accountType){
        this.type = type;
        this.accNumber = accNumber;
        this.balance = balance;
    }
}

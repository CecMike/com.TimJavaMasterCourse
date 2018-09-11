package ConstructorAndBancAcountChallenge;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void deposit(int amount) {
        setBalance(getBalance()+amount);
        System.out.println(amount + " has been deposited your current balance is " + getBalance() + "$");
    }

    public void witdraw(int amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds for this operation");
        } else {
            setBalance(getBalance()-amount);
            System.out.println(amount + " was withdrawn and the remaining balance is " + getBalance() + "$");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

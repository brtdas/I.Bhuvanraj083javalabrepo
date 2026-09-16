// Base Class
abstract class Account {
    private String accountNumber;
    private double balance;
    private String accountType;

    public Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + accountNumber);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
        }
    }

    public void transfer(Account targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Transferred $" + amount + " to " + targetAccount.getAccountNumber());
        } else {
            System.out.println("Transfer failed.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void displayAccountInfo() {
        System.out.println("Account No: " + accountNumber + " | Type: " + accountType + " | Balance: $" + balance);
    }
}

// Savings Account Class
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, "Savings");
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: $" + interest);
    }
}

// Current Account Class
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount >= -overdraftLimit)) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew $" + amount + " using overdraft from " + getAccountNumber());
        } else {
            System.out.println("Withdrawal failed. Exceeds overdraft limit.");
        }
    }
}

// Main Test Class
public class Banksystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV101", 1000.0, 4.5);
        CurrentAccount current = new CurrentAccount("CUR201", 500.0, 200.0);

        System.out.println("--- Initial Status ---");
        savings.displayAccountInfo();
        current.displayAccountInfo();

        System.out.println("\n--- Transactions ---");
        savings.deposit(200.0);
        savings.calculateInterest();

        current.withdraw(600.0); // Uses overdraft limit
        
        System.out.println("\n--- Transfer ---");
        savings.transfer(current, 300.0);

        System.out.println("\n--- Final Status ---");
        savings.displayAccountInfo();
        current.displayAccountInfo();
    }
}

package oops.Interfaces;

// BankExample.java

interface BankOperations {

    // Abstract Methods (must be implemented)
    void deposit(double amount);
    void withdraw(double amount);

    // Default Method
    default void checkBalance(double balance) {
        System.out.println("Your current balance is: ₹" + balance);
    }

    // Static Method
    static void bankPolicy() {
        System.out.println("All banks follow RBI guidelines.");
    }

    // Private Method (helper for logging)
    private void logTransaction(String type, double amount) {
        System.out.println("Transaction Log -> " + type + ": ₹" + amount);
    }

    // Default Method using Private Method
    default void transfer(double amount, String toAccount) {
        logTransaction("Transfer", amount);
        System.out.println("₹" + amount + " transferred to account: " + toAccount);
    }

    // Default Method for Interest Calculation (can be overridden by banks)
    default void calculateInterest(double principal, int years) {
        double rate = 5.0; // Default interest rate (5%)
        double interest = (principal * rate * years) / 100;
        System.out.println("Default Interest (at " + rate + "%) for " + years + " years: ₹" + interest);
    }
}

// SBI Bank Implementation
class SBI implements BankOperations {
    private double balance;

    SBI(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("SBI: Deposited ₹" + amount + " successfully.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("SBI: Withdrawn ₹" + amount + " successfully.");
        } else {
            System.out.println("SBI: Insufficient Balance!");
        }
    }

    @Override
    public void checkBalance(double balance) {
        System.out.println("SBI Bank Balance: ₹" + this.balance);
    }

    // SBI custom interest rate
    @Override
    public void calculateInterest(double principal, int years) {
        double rate = 6.5; // SBI rate
        double interest = (principal * rate * years) / 100;
        System.out.println("SBI Interest (at " + rate + "%) for " + years + " years: ₹" + interest);
    }

    public double getBalance() {
        return balance;
    }
}

// ICICI Bank Implementation
class ICICI implements BankOperations {
    private double balance;

    ICICI(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("ICICI: Deposited ₹" + amount + " successfully.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("ICICI: Withdrawn ₹" + amount + " successfully.");
        } else {
            System.out.println("ICICI: Insufficient Balance!");
        }
    }

    @Override
    public void checkBalance(double balance) {
        System.out.println("ICICI Bank Balance: ₹" + this.balance);
    }

    // ICICI custom interest rate
    @Override
    public void calculateInterest(double principal, int years) {
        double rate = 7.0; // ICICI rate
        double interest = (principal * rate * years) / 100;
        System.out.println("ICICI Interest (at " + rate + "%) for " + years + " years: ₹" + interest);
    }

    public double getBalance() {
        return balance;
    }
}

// Axis Bank Implementation
class Axis implements BankOperations {
    private double balance;

    Axis(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Axis: Deposited ₹" + amount + " successfully.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Axis: Withdrawn ₹" + amount + " successfully.");
        } else {
            System.out.println("Axis: Insufficient Balance!");
        }
    }

    @Override
    public void checkBalance(double balance) {
        System.out.println("Axis Bank Balance: ₹" + this.balance);
    }

    // Axis custom interest rate
    @Override
    public void calculateInterest(double principal, int years) {
        double rate = 6.0; // Axis rate
        double interest = (principal * rate * years) / 100;
        System.out.println("Axis Interest (at " + rate + "%) for " + years + " years: ₹" + interest);
    }

    public double getBalance() {
        return balance;
    }
}

// Test Class
public class BankExample {
    public static void main(String[] args) {
        // SBI Account
        SBI sbi = new SBI(5000);
        sbi.deposit(2000);
        sbi.withdraw(1500);
        sbi.checkBalance(0);
        sbi.transfer(1000, "SBI-12345");
        sbi.calculateInterest(10000, 2);

        System.out.println("-------------------------");

        // ICICI Account
        ICICI icici = new ICICI(8000);
        icici.deposit(3000);
        icici.withdraw(4000);
        icici.checkBalance(0);
        icici.transfer(2000, "ICICI-67890");
        icici.calculateInterest(10000, 2);

        System.out.println("-------------------------");

        // Axis Account
        Axis axis = new Axis(10000);
        axis.deposit(5000);
        axis.withdraw(2000);
        axis.checkBalance(0);
        axis.transfer(2500, "AXIS-54321");
        axis.calculateInterest(10000, 2);

        System.out.println("-------------------------");

        // Static Method (common to all banks)
        BankOperations.bankPolicy();
    }
}


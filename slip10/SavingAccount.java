// Q2. Define a class SavingAccount (acno, name, balance). Define appropriate operations as,
// withdraw(), deposit(), and viewbalance(). The minimum balance must be 500. Create an object
// and perform operation. Raise user defined ―InsufficientFundException when balance is not
// sufficient for withdraw operation. 

// User-defined exception for insufficient funds
class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

public class SavingAccount {
    private int acno;
    private String name;
    private double balance;
    private static final double MIN_BALANCE = 500;

    // Constructor to initialize account details
    public SavingAccount(int acno, String name, double balance) {
        this.acno = acno;
        this.name = name;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        viewBalance();
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundException {
        if ((balance - amount) < MIN_BALANCE) {
            throw new InsufficientFundException("Insufficient balance! Minimum balance of " + MIN_BALANCE + " must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            viewBalance();
        }
    }

    // Method to view current balance
    public void viewBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        SavingAccount acc = new SavingAccount(101, "John Doe", 1000);

        acc.viewBalance(); // View initial balance
        acc.deposit(500);  // Deposit 500
        try {
            acc.withdraw(800); // Withdraw 800
            acc.withdraw(300); // Withdraw 300, should throw exception
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}

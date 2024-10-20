// Q2. Write a program to create class Account (accno, accname, balance). Create an array of 'n'
// Account objects. Define static method "sortAccount" which sorts the array on the basis of balance.
// Display account details in sorted order.
// [20 Marks]

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Account {
    int accno;
    String accname;
    double balance;

    // Constructor
    public Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    // Display Account Details
    public void display() {
        System.out.println("Account No: " + accno + ", Account Name: " + accname + ", Balance: " + balance);
    }

    // Static method to sort accounts by balance
    public static void sortAccount(Account[] accounts) {
        Arrays.sort(accounts, Comparator.comparingDouble(acc -> acc.balance));
    }
}

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number of accounts from user
        System.out.println("Enter number of accounts: ");
        int n = scanner.nextInt();

        // Create an array of Account objects
        Account[] accounts = new Account[n];

        // Input details for each account
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            int accno = scanner.nextInt();
            System.out.print("Account Name: ");
            String accname = scanner.next();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();

            // Initialize Account object
            accounts[i] = new Account(accno, accname, balance);
        }

        // Sort the accounts by balance
        Account.sortAccount(accounts);

        // Display sorted account details
        System.out.println("\nAccounts sorted by balance:");
        for (Account account : accounts) {
            account.display();
        }
    }
}

package WT_LAB;
import java.util.Scanner;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class BankCustomer {
    private int accountNo;
    private String name;
    private double balance;
    private int branchCode;

    public BankCustomer(int accountNo, String name, double balance, int branchCode) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.branchCode = branchCode;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative. Please try again.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative. Please try again.");
        }
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }
}

public class bank {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer(12345, "John Doe", 1000, 6789);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    try {
                        customer.deposit(depositAmount);
                        System.out.println("Deposit successful.");
                    } catch (NegativeAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    try {
                        customer.withdraw(withdrawalAmount);
                        System.out.println("Withdrawal successful.");
                    } catch (NegativeAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + customer.checkBalance());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
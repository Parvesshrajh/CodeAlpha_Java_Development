import java.util.Scanner;

public class Main {

    // Variable to hold the account balance
    private static double balance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to the Simple Banking Application!");

        // Main menu loop
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Simple Banking Application. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Method to check the account balance
    private static void checkBalance() {
        System.out.printf("Your current balance is: %.2f%n", balance);
    }

    // Method to deposit money into the account
    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited %.2f. Your new balance is %.2f.%n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw money from the account
    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Successfully withdrew %.2f. Your new balance is %.2f.%n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }
}

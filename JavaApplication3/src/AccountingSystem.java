
import java.util.Scanner;

public class AccountingSystem {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the command line
    Scanner scanner = new Scanner(System.in);

    // Create a variable to store the current balance
    double balance = 0;

    // Prompt the user to enter a transaction
    System.out.println("Enter a transaction (deposit, withdrawal, or check balance):");
    String transaction = scanner.nextLine();

    // Continue prompting the user until they enter "check balance"
    while (!transaction.equals("check balance")) {
      if (transaction.equals("deposit")) {
        // Prompt the user to enter the amount to deposit
        System.out.println("Enter amount to deposit:");
        double amount = scanner.nextDouble();

        // Add the amount to the balance
        balance += amount;
      } else if (transaction.equals("withdrawal")) {
        // Prompt the user to enter the amount to withdraw
        System.out.println("Enter amount to withdraw:");
        double amount = scanner.nextDouble();

        // Subtract the amount from the balance
        balance -= amount;
      }

      // Prompt the user to enter the next transaction
      System.out.println("Enter a transaction (deposit, withdrawal, or check balance):");
      transaction = scanner.nextLine();
    }

    // Print the final balance
    System.out.println("Balance: " + balance);
  }
}
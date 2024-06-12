import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Transaction {
    private int id;
    private double amount;
    private String description;

    public Transaction(int id, double amount, String description) {
        this.id = id;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Transaction{id=" + id + ", amount=" + amount + ", description='" + description + "'}";
    }
}

public class TransactionManager {
    private List<Transaction> transactions;
    private int nextId;

    public TransactionManager() {
        transactions = new ArrayList<>();
        nextId = 1;
    }

    public void addTransaction(double amount, String description) {
        transactions.add(new Transaction(nextId++, amount, description));
    }

    public void removeTransaction(int id) {
        transactions.removeIf(transaction -> transaction.getId() == id);
    }

    public Transaction findTransaction(int id) {
        for (Transaction transaction : transactions) {
            if (transaction.getId() == id) {
                return transaction;
            }
        }
        return null;
    }

    public double calculateTotal() {
        double total = 0;
        for (Transaction transaction : transactions) {
            total += transaction.getAmount();
        }
        return total;
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionManager manager = new TransactionManager();

        while (true) {
            System.out.println("Choose an action: add, remove, print, find, total, exit");
            String action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "add":
                    System.out.println("Enter amount:");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    System.out.println("Enter description:");
                    String description = scanner.nextLine();
                    manager.addTransaction(amount, description);
                    break;
                case "remove":
                    System.out.println("Enter transaction ID to remove:");
                    int idToRemove = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    manager.removeTransaction(idToRemove);
                    break;
                case "print":
                    manager.printTransactions();
                    break;
                case "find":
                    System.out.println("Enter transaction ID to find:");
                    int idToFind = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    Transaction transaction = manager.findTransaction(idToFind);
                    if (transaction != null) {
                        System.out.println(transaction);
                    } else {
                        System.out.println("Transaction not found.");
                    }
                    break;
                case "total":
                    System.out.println("Total amount: " + manager.calculateTotal());
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid action. Try again.");
            }
        }
    }
}

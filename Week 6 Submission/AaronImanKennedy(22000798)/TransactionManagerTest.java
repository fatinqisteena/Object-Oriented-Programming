public class TransactionManagerTest {
    public static void main(String[] args) {
        
        TransactionManager manager = new TransactionManager();
        
        manager.addTransaction(100.0, "Groceries");
        manager.addTransaction(250.5, "Electronics");
        manager.addTransaction(75.75, "Books");

        System.out.println("Printing all transactions:");
        manager.printTransactions();
 
        System.out.println("\nFinding transaction with ID 2:");
        Transaction foundTransaction = manager.findTransaction(2);
        System.out.println(foundTransaction != null ? foundTransaction : "Transaction not found.");

        System.out.println("\nCalculating total amount:");
        double totalAmount = manager.calculateTotal();
        System.out.println("Total amount: " + totalAmount);

        System.out.println("\nRemoving transaction with ID 1:");
        manager.removeTransaction(1);
        manager.printTransactions();

        System.out.println("\nFinding transaction with ID 1 (should be removed):");
        Transaction missingTransaction = manager.findTransaction(1);
        System.out.println(missingTransaction != null ? missingTransaction : "Transaction not found.");
        
        System.out.println("\nCalculating total amount after removal:");
        totalAmount = manager.calculateTotal();
        System.out.println("Total amount: " + totalAmount);
    }
}
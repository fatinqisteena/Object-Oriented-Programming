import java.util.ArrayList;
import java.util.List;

class Product {
}

class Transaction {
    private List<Product> products;
    private String date;
    
    public Transaction(List<Product> products, String date) {
        this.products = products;
        this.date = date;
    }
    
    public void calcTotalPrice() {
    
    }
}

public class Main {
    public static void main(String[] args) {
        
        List<Product> products = new ArrayList<>(); 
        
        String date = "2024-06-02"; 
        
        Transaction transaction = new Transaction(products, date); 
        transaction.calcTotalPrice();
    }
}
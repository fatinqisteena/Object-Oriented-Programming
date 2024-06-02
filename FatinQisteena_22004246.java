import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        // Constructor
    }

    public String getName() {
        // Method to get name
        return null;
    }

    public double getPrice() {
        // Method to get price
        return 0.0;
    }

    @Override
    public String toString() {
        // Method to return string representation
        return null;
    }
}

class Supplier {
    private String name;
    private String contact;
    private String address;
    private List<Product> products;

    public Supplier(String name, String contact, String address) {
        // Constructor
        this.products = new ArrayList<>();
    }

    public String getName() {
        // Method to get name
        return null;
    }

    public String getContact() {
        // Method to get contact
        return null;
    }

    public String getAddress() {
        // Method to get address
        return null;
    }

    public List<Product> getProducts() {
        // Method to get products
        return null;
    }

    public void addProduct(Product product) {
        // Method to add product
    }

    public void removeProduct(String productName) {
        // Method to remove product
    }

    @Override
    public String toString() {
        // Method to return string representation
        return null;
    }
}

public class SupplierTest {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1500.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Tablet", 300.00);

        // Create supplier
        Supplier supplier = new Supplier("Tech Supplies Inc.", "123-456-7890", "123 Tech Street");

        // Add products to the supplier
        supplier.addProduct(product1);
        supplier.addProduct(product2);
        supplier.addProduct(product3);

        // Print supplier details
        System.out.println("Supplier details:");
        System.out.println(supplier);

        // Remove a product
        supplier.removeProduct("Smartphone");

        // Print supplier details after removal
        System.out.println("Supplier details after removing a product:");
        System.out.println(supplier);
    }
}

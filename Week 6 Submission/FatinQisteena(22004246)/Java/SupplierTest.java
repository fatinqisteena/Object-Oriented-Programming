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

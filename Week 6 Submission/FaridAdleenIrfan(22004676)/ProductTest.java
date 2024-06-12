// ProductTest.java
public class ProductTest {
    public static void main(String[] args) {
        // Create a Products object to manage multiple products
        Products products = new Products();

        // Create some Product objects
        Product iphone = new Product("Apple iPhone", 12345, "Latest iPhone model", 999.99, 10, "Apple Inc.");
        Product samsung = new Product("Samsung Galaxy", 67890, "Latest Samsung model", 899.99, 15, "Samsung Electronics");

        // Add products to the list
        products.addProduct(iphone);
        products.addProduct(samsung);

        // Print all products
        System.out.println("All products:");
        products.printProducts();

        // Check availability of a product
        System.out.println("Is product 12345 available? " + products.isProductAvailable(12345));

        // Process an order for a product
        System.out.println("Processing order for 5 units of product 12345: " + iphone.processOrder(5));
        products.printProducts();

        // Update product information
        products.updateProduct(12345, "Apple iPhone 13", "Newest iPhone model", 1099.99, 8, "Apple Inc.");
        System.out.println("Updated product 12345:");
        products.printProducts();

        // Calculate total inventory value
        System.out.println("Total inventory value: $" + products.getTotalInventoryValue());

        // Remove a product
        products.removeProduct(67890);
        System.out.println("All products after removal:");
        products.printProducts();
    }
}

public class Product {
    private String name;
    private int productId;
    private String description;
    private double price;
    private int quantity;
    private String supplier;

    public Product(String name, int productId, String description, double price, int quantity, String supplier) {
        this.name = name;
        this.productId = productId;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSupplier() {
        return supplier;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    // Blank methods
    public void updateProductInfo() {
        // blank method, no implementation
    }

    public void checkAvailability() {
        // blank method, no implementation
    }

    public void processOrder() {
        // blank method, no implementation
    }

    public void displayProductDetails() {
        // blank method, no implementation
    }

    public void calculateTotalCost() {
        // blank method, no implementation
    }

    public static void main(String[] args) {
        // Create a new Product object
        Product product = new Product("Apple iPhone", 12345, "Latest iPhone model", 999.99, 10, "Apple Inc.");

        // Print product details
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Supplier: " + product.getSupplier());
    }
}
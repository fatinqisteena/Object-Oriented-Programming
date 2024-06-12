public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Apple iPhone", 12345, "Latest iPhone model", 999.99, 10, "Apple Inc.");

        product.displayProductDetails();

        System.out.println("Is product available? " + product.checkAvailability());

        System.out.println("Processing order of 5 units: " + product.processOrder(5));

        product.displayProductDetails();

        System.out.println("Total cost of available stock: RM" + product.calculateTotalCost());
    }
}
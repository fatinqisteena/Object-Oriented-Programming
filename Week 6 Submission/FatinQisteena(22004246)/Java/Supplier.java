import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String name;
    private String contact;
    private String address;
    private List<Product> products;

    public Supplier() {
        this.products = new ArrayList<>();
    }

    public Supplier(String name, String contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String productName) {
        products.removeIf(product -> product.getName().equals(productName));
    }

    @Override
    public String toString() {
        return "Supplier{name='" + name + "', contact='" + contact + "', address='" + address + "', products=" + products + "}";
    }
}

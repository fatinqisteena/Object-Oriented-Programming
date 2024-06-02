import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Products {
    private List<Product> productList;

    public Products() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(int productId) {
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId() == productId) {
                iterator.remove();
                break;
            }
        }
    }

    public void printProducts() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public Product findProduct(int productId) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
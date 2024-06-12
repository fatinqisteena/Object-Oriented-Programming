import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        String date = "2024-06-02";
        Transaction transaction = new Transaction(products, date);
        transaction.calcTotalPrice();
    }
}

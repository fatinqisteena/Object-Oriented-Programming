import java.util.ArrayList;
import java.util.List;

class Transactions{
    private int id;
    private double amount;
    private String description;

    public Transactions(int id, double amount, String description) {
        this.id = id;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{id=" + id + ", amount=" + amount + ", description='" + description + "'}";
    }
}

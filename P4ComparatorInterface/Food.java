package P4ComparatorInterface;

public class Food {
    private String itemName;
    private double price;
    public Food(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return itemName + ": $" + price;
    }
}

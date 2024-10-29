
public class Product {
    public static final double Diskon = 0.9;
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.setName(name);
        this.setPrice(price);
        this.setStock(stock);
    }

    public void displayProduct() {
        // 10% discount
        System.out.println("Product Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Discounted Price: $" + getPrice() * Calculatediscount());
        System.out.println("Stock: " + getStock());
    }

    private static double Calculatediscount() {
        return Diskon;
    }

    public void applyStockAdjustment(int adjustment) {
        setStock(getStock() + adjustment);
        System.out.println("Stock adjusted. New stock: " + getStock());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
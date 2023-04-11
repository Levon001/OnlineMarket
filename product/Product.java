package OnlineMarket.product;

abstract public class Product {
    private static int productId;
    private  String name;
    private String description;
    private double price;
    private int stock;
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock+=1;
        productId++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }


    public  int getProductId() {
        return productId;
    }
}

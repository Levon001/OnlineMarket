package OnlineMarket.shoppingCartItem;
import OnlineMarket.product.Product;
public class ShoppingCartItem {
    private int quantity = 0;
    private Product product;

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

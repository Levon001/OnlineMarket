package OnlineMarket.buyer;

import OnlineMarket.product.Product;
import OnlineMarket.shoppingCart.ShoppingCart;
import OnlineMarket.shoppingCartItem.ShoppingCartItem;

import java.util.Iterator;

public class Buyer {
    private int buyerId;
    private String firstName;
    private String lastName;
    private ShoppingCart cart;
    private String email;
    private static int idCounter;

    public Buyer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        cart = new ShoppingCart();
        buyerId = idCounter++;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ShoppingCart getCart() {
        return cart;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public void addProductToCart(Product item) {

        Iterator<ShoppingCartItem> itr = this.cart.items.iterator();
        while (itr.hasNext()) {
            ShoppingCartItem currentItem = itr.next();
            if (currentItem.getProduct().getName() == item.getName()) {
                int currentQuantity = currentItem.getQuantity();
                currentItem.setQuantity(currentQuantity + 1);
                return;
            }
        }
        ShoppingCartItem i = new ShoppingCartItem();
        i.setProduct(item);
        i.setQuantity(1);

        this.cart.addItem(i);
    }

//    public void print() {
//        for (int i = 0; i < this.cart.items.size(); i++) {
//            System.out.println(this.cart.items.get(i).getProduct().getName());
//        }
//    }

}

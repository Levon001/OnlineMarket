package OnlineMarket.shoppingCart;
import OnlineMarket.product.Product;
import OnlineMarket.shoppingCartItem.ShoppingCartItem;

import OnlineMarket.buyer.Buyer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShoppingCart {
    public ArrayList<ShoppingCartItem> items = new ArrayList<>();

//   private Buyer owner;


//    public ShoppingCart(Buyer owner) {
//        this.owner = owner;
//    }


//    public void print() {
////        System.out.println(cart.items.get(0));
//        for (int i = 0; i < items.size(); i++) {
//            System.out.println(items.get(i).getProduct().getName());
//        }
//    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
    }

    public ShoppingCartItem getShopingCartItem(String name) {
        for (int i = 0; i < this.items.size(); i++) {
            if (items.get(i).getProduct().getName() == name) {
                return items.get(i);
            }
        }
        return null;
    }

//   public Buyer getOwner(){
//       return owner;
//   }

    public void removeItem(ShoppingCartItem item) {
        if (item == null) return;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProduct().getName().equals(item.getProduct().getName())) {
                items.remove(i);
                return;
            }
        }
    }

    public void emptyCart() {
        items = new ArrayList<>();
    }

    public double getTotalPrice() {
        double currentSum = 0;
        Iterator<ShoppingCartItem> itr = items.iterator();
        while (itr.hasNext()) {
            ShoppingCartItem i = itr.next();
            currentSum += i.getProduct().getPrice() * i.getQuantity();
        }
        return currentSum;
    }

    public void updateItemQuantity(int count, String productName) {
        if (count < 0) {
            return;
        }
        Iterator<ShoppingCartItem> itr = items.iterator();
        while (itr.hasNext()) {
            ShoppingCartItem i = itr.next();
            if (i.getProduct().getName().equals(productName)) {
                i.setQuantity(count);
            }
        }
    }

}

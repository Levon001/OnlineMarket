package OnlineMarket.Main;
import OnlineMarket.buyer.Buyer;
import OnlineMarket.fruits.Watermelon;
import OnlineMarket.fruits.Grapes;
import OnlineMarket.product.Product;
import OnlineMarket.shop.Shop;

public class Main {
    public static void main(String[] args) {
        Product obj = new Watermelon("green", 1);
        Product obj1 = new Watermelon("blue", 1);
        Product obj2 = new Grapes("yellow", 2);

        Buyer client = new Buyer("Raz", "yan", "blackqueen@gmail.com");
        Buyer client1 = new Buyer("Raz", "yan", "ashot@gmail.com");


        Shop shop1 = new Shop();
        shop1.addProduct(obj);
        shop1.addProduct(obj1);
        Buyer client2 = new Buyer("Raz", "yan", "blackqueen@gmail.com");
        Buyer client3 = new Buyer("Raz", "yan", "ashot@gmail.com");


        Shop shop2 = new Shop();
        shop1.addProduct(obj);
        shop1.addProduct(obj1);
        shop1.addProduct(obj2);
        shop1.addProduct(obj2);
        shop1.addProduct(obj2);

        shop1.addBuyer(client);
        shop1.addBuyer(client);

        client1.addProductToCart(obj);
        client1.addProductToCart(obj2);
        client1.addProductToCart(obj2);
        client1.addProductToCart(obj2);
        client1.addProductToCart(obj2);
        client1.getCart().removeItem(client1.getCart().getShopingCartItem("grapes"));

        client1.getCart().updateItemQuantity(-8, "Watermelon");
        System.out.println(client1.getCart().getShopingCartItem("Watermelon").getQuantity());
        System.out.println(client1.getCart().getTotalPrice());

        client1.print();

//
//       shop1.displayProduct();
        shop1.displayBuyer();

    }
}
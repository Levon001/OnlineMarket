package OnlineMarket.shop;
import OnlineMarket.buyer.Buyer;
import OnlineMarket.product.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Shop {
    private static ArrayList<Buyer> buyerList = new ArrayList<>();

    private Map<String, Integer> productNameToCount = new HashMap<>();

    public ArrayList<Buyer> getBuyerList() {
        return buyerList;
    }

    public void addProduct(Product product) {
        if (productNameToCount.containsKey(product.getName())) {
            int tmp = productNameToCount.get(product.getName());
            productNameToCount.put(product.getName(), ++tmp);
        } else {
            productNameToCount.put(product.getName(), 1);
        }
    }

    public void displayProduct() {
        System.out.println(productNameToCount);
    }

    public void addBuyer(Buyer client) {
        Iterator<Buyer> itr = buyerList.iterator();
        while (itr.hasNext()) {
            if (itr.next().getEmail().equals(client.getEmail())) {
                return;
            }
        }
        buyerList.add(client);
    }

    public void displayBuyer() {
        for (Buyer item : buyerList) {
            System.out.println(item.getFirstName() + " " + item.getLastName() + " " + item.getBuyerId());
        }
    }
}



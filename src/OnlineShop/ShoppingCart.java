package OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    Map<String, Item> inShoppingCart;

    public ShoppingCart(){
        this.inShoppingCart = new HashMap<>();
    }

    public void add(String product, int price){
        this.inShoppingCart.put(product, new Item(product, 1, price));
    }

    public int price(){
        int sum = 0;
        for(Item item : inShoppingCart.values()){
            sum = sum + item.price();
        }

        return sum;
    }

    public void print(){
        for (Item item: inShoppingCart.values()){
            System.out.println(item.toString());
        }
    }
}

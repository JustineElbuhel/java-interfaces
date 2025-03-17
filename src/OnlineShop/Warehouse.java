package OnlineShop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stockMap;

    public Warehouse(){
        this.prices = new HashMap<>();
        this.stockMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        stockMap.put(product, stock);
    }

    public int price(String product){
        return this.prices.getOrDefault(product, -99);
    }

    public int stock(String product){
        return this.stockMap.getOrDefault(product, 0);
    }

    public boolean take(String product){
        if(this.stockMap.get(product) == null){
            return false;
        }
        if(this.stockMap.get(product) > 0){
            stockMap.replace(product,(this.stockMap.get(product) - 1));
            return true;
        }

        return false;
    }

    public Set<String> products(){
        Set<String> products = new HashSet<>();
        for(String key : prices.keySet()){
            products .add(key);
        }

        return products;
    }
}

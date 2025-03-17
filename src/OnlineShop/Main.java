package OnlineShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }

    public void settingUpClasses(){
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("Milk", 3, 10);
        warehouse.addProduct("Coffee", 5, 7);

        System.out.println("Prices:");
        System.out.println("Milk: "  + warehouse.price("Milk"));
        System.out.println("Coffee: "  + warehouse.price("Coffee"));
        System.out.println("Sugar: "  + warehouse.price("Sugar"));

        System.out.println();
        System.out.println("Stock: ");
        System.out.println("Milk: "  + warehouse.stock("Milk"));
        System.out.println("Coffee: "  + warehouse.stock("Coffee"));
        System.out.println("Sugar: "  + warehouse.stock("Sugar"));

        System.out.println();
        System.out.println("Taking milk - " + warehouse.take("Milk"));
        System.out.println("Taking coffee - " + warehouse.take("Coffee"));
        System.out.println("Taking sugar - " + warehouse.take("Sugar"));

        System.out.println();
        for(String product: warehouse.products()){
            System.out.println(product);
        }

        System.out.println();
        Item item = new Item("Chocolate", 4, 2);
        System.out.println("An item that contains 4 chocolate bars has a total of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);

        System.out.println();
        ShoppingCart cart = new ShoppingCart();
        cart.add("Milk", 3);
        cart.add("Buttermilk", 2);
        cart.add("Cheese", 5);
        System.out.println("Cart price: " + cart.price());
        cart.add("Laptop", 899);
        System.out.println("Cart price: " + cart.price());

        System.out.println();
        cart.print();

        ShoppingCart cart2 = new ShoppingCart();
        cart2.add("milk", 3);
        cart2.print();
        System.out.println("Cart price: " + cart2.price() + "\n");

        cart2.add("buttermilk", 5);
        cart2.print();
        System.out.println("Cart price: " + cart2.price() + "\n");

        cart2.add("milk", 3);
        cart2.print();

        System.out.println("Cart price: " + cart2.price() + "\n");
        cart2.add("milk", 3);
        cart2.print();
        System.out.println("Cart price: " + cart2.price() + "\n");
    }
}

package OnlineShop;

import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner){
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    //The method that handles the customers visit to the store
    public void shop(String customer){
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("Our selection: ");

        for(String product : this.warehouse.products()){
            System.out.println(product);
        }

        while(true){
            System.out.println("What would you like to add to the cart? (Press enter to go to the register)");
            String product = scanner.nextLine();
            if(product.isEmpty()){
                break;
            }

            if(warehouse.products().contains(product)){
                int price = warehouse.price(product);
                cart.add(product, price);
                warehouse.take(product);
            }
        }

        System.out.println("Your cart contents: ");
        cart.print();
        System.out.println("Total: " + cart.price());
    }

}

package OnlineShop;

public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int quantity, int unitPrice){
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProduct(){
        return this.product;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public int getUnitPrice(){
        return this.unitPrice;
    }

    public int price(){
        return this.unitPrice * this.quantity;
    }

    public void increaseQuantity(){
        this.quantity++;
    }

    @Override
    public String toString(){
        return this.product + ": " + this.quantity;
    }
}

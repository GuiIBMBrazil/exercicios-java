package entitiees;

public class OrderItem {
    private int quantity;
    double price;

    private Product product;

    public OrderItem() {}

    public OrderItem(int quantity,Product product) {
        this.quantity = quantity;
        this.product = product;
    }
    public double subTotal(){
       return product.getPrice()*quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

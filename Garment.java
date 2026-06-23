public abstract class Garment{
    private String id;
    private double price;
    private int stockQuantity;

    public Garment(String id , double price , int stockQuantity){
        this.id = id;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getId(){
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
    public abstract void displayDetails();
}
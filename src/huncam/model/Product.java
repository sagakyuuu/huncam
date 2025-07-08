package huncam.model;

public class Product {

    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String imagePath;

    public Product(int id, String name, String description, double price, int stock, String imagePath) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getImagePath() {
        return imagePath;
    }

}

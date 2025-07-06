package Polimorfismo;

public class Product {

    private String name;

    private Double price;

    public Product() {
    }

    public Product(final String name, final Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }

    public String priceTag() {
        return "Name: " + name + ", Price: $" + price;
    }

}

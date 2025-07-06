package Polimorfismo;

import java.util.Date;

public class UsedProduct extends Product{

    private Date manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(final String name, final Double price, final Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(final Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(final Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return "Name: " + getName() + ", Price: $" + getPrice() + ", Date Manufacture: " + manufactureDate;
    }

}

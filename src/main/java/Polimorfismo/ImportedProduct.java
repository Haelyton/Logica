package Polimorfismo;

import java.util.Date;

public class ImportedProduct extends Product{

    private Double customFee;

    public ImportedProduct(final Double customFee) {
        this.customFee = customFee;
    }

    public ImportedProduct(final String name, final Double price, final Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public ImportedProduct() {
    }

    public Double getManufactureDate() {
        return customFee;
    }

    public void setManufactureDate(final Double customFee) {
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        return "Name: " + getName() + ", Price: $" + getPrice() + ", Taxa personalizada: " + customFee;
    }
}

package co.com.projectwongweb.models;

public class Product {

    private String name;

    private String quantity;

    public Product(String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }
}

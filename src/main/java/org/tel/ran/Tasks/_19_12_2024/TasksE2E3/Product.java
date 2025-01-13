package org.tel.ran.Tasks._19_12_2024.TasksE2E3;

public class Product{
    int id;
    String name;
    double price;
    String description;
    boolean inStock;
    Category category;
    double discount;

    public Product() {
    }

    public Product(int id, String name, double price, String description, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
    }

    public Product(int id, String name, double price, String description, boolean inStock, Category category, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
        this.category = category;
        this.discount = discount;
    }

    public double calculateFinalPrice(){
        return price*(1 - discount/100);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", inStock=" + inStock +
                ", category=" + category +
                ", discount=" + discount +
                '}';
    }
}
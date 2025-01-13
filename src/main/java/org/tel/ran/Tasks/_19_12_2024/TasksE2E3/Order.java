package org.tel.ran.Tasks._19_12_2024.TasksE2E3;

import java.time.LocalDate;
import java.util.List;

public class Order {
    int id;
    Customer customer;
    List <Product> productList;
    double totalAmount;
    OrderStatus status;
    LocalDate orderDate;

    public Order() {
    }

    public Order(int id, Customer customer, List<Product> productList) {
        this.id = id;
        this.customer = customer;
        this.productList = productList;
        calculateTotalAmount();
    }

    public Order(int id, Customer customer, List<Product> productList, OrderStatus status, LocalDate orderDate) {
        this.id = id;
        this.customer = customer;
        this.productList = productList;
        this.status = status;
        this.orderDate = orderDate;
    }

    public void calculateTotalAmount(){
        for (Product p: productList){
            totalAmount += p.calculateFinalPrice();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", totalAmount=" + totalAmount +
                ", status=" + status +
                ", orderDate=" + orderDate +
                '}';
    }
}

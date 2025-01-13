package org.tel.ran.Tasks._19_12_2024.TasksE2E3;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Faker fkr = new Faker();
        Customer customer1 = new Customer(1,fkr.name().firstName(),fkr.name().lastName(),fkr.internet().emailAddress(),fkr.phoneNumber().phoneNumber());
        System.out.println(customer1.toString());

        for (int i = 1; i < 3; i++) {
            Address address = new Address(fkr.address().streetAddress(), fkr.address().city(), fkr.address().zipCode(),fkr.address().country());
            customer1.addAddress(address);
            System.out.println(customer1.getAddresses().getLast().toString());
        }

        List <Product> orders = new ArrayList<>();
        Category category1 = new Category(1,"Tools","Tools for life");
        System.out.println(category1.toString());

        for (int i = 1; i < 5; i++) {
            String productDescription = fkr.commerce().productName();
            double price =  fkr.random().nextDouble() * 1000;
            orders.add(new Product(i,productDescription.substring(productDescription.lastIndexOf(" ") + 1), price, productDescription,true,category1,fkr.random().nextInt(5,30)));
            System.out.println(orders.getLast().toString());
            System.out.println("FinalPrice = " + orders.getLast().calculateFinalPrice());
        }

        LocalDate orderDate = fkr.date().past(1, TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        OrderStatus orderStatus = new OrderStatus(1, "Processing", orderDate);

        Order order1 = new Order(1,customer1,orders,orderStatus,orderDate);
        order1.calculateTotalAmount();
        System.out.println(order1.toString());

        LocalDate updateDate = fkr.date().future(1, TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        orderStatus.setUpdateDate(updateDate);
        orderStatus.setStatus("Shipped");
        System.out.println(order1.toString());
        orderStatus.setStatus("Delivered");
    }
}

package org.tel.ran.Tasks._19_12_2024.TasksE4;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker fkr = new Faker();
        Person person1 = new Person(1, fkr.name().fullName(), fkr.internet().emailAddress());
        System.out.println("person1 = " + person1.toString());

        Employee employee1 = new Employee(2,fkr.name().fullName(), fkr.internet().emailAddress(), fkr.company().profession(),fkr.random().nextDouble()*5000);
        System.out.println("employee1 = " + employee1.toString());

        Manager manager1 = new Manager(3,fkr.name().fullName(), fkr.internet().emailAddress(), "Manager",fkr.random().nextDouble()*5000, fkr.random().nextInt(3,10),fkr.random().nextDouble()*500);
        System.out.println("manager1 = " + manager1.toString());
        System.out.println("TotalSalary = " + manager1.calculateTotalSalary());

    }
}

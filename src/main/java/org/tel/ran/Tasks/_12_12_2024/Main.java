package org.tel.ran.Tasks._12_12_2024;

import com.github.javafaker.Faker;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Faker faker = new Faker();
        Company[] companies = new Company[3];

        for (int k = 0; k < companies.length; k++) {
            Department[] departments = new Department[3];
            companies[k] = new Company(1,faker.company().name(),faker.address().fullAddress(),departments);
            System.out.println("companies[" + k + "] = " + companies[k]);
            for (int i = 0; i < departments.length; i++) {
                Employee[] employees = new Employee[10];
                departments[i] = new Department(i + 1,
                        faker.commerce().department(),
                        10,
                        employees);
                System.out.println("departments[" + i + "] = " + departments[i]);
                for (int j = 0; j < employees.length; j++) {
                    employees[j] = new Employee(i*10 + j + 1,
                            faker.name().fullName(),
                            rnd.nextInt(0,65),
                            rnd.nextDouble(1500,10000),
                            rnd.nextBoolean());
                    System.out.println("employees[" + j + "] = " + employees[j] + " of department №" + (i + 1));
                }
            }
        }

        Employee maxSalaryEmployee = companies[0].getMaxSalaryEmployee();
        System.out.println("company.getMaxSalaryEmployee() = " + maxSalaryEmployee + " in " + companies[0].getName());
        companies[1].compareSalaryToEmployees(maxSalaryEmployee);
        companies[2].compareSalaryToEmployees(maxSalaryEmployee);
    }
}

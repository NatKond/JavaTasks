package org.tel.ran.Tasks._12_12_2024;

import java.util.Arrays;

public class Department {
    private int id;
    private String name;
    private int maxEmployeeNumber;
    private Employee[] employees;

    public Department(int id, String name, int maxEmployeeNumber, Employee[] employees) {
        this.id = id;
        this.name = name;
        this.maxEmployeeNumber = maxEmployeeNumber;
        this.employees = employees;
    }

    public Department() {
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

    public int getMaxEmployeeNumber() {
        return maxEmployeeNumber;
    }

    public void setMaxEmployeeNumber(int maxEmployeeNumber) {
        this.maxEmployeeNumber = maxEmployeeNumber;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxEmployeeNumber=" + maxEmployeeNumber +
                '}';
    }
}

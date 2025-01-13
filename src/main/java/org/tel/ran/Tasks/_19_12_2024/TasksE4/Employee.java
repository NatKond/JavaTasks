package org.tel.ran.Tasks._19_12_2024.TasksE4;

public class Employee extends Person {
    String position;
    double salary;

    public Employee() {
    }

    public Employee(int id, String name, String email, String position, double salary) {
        super(id, name, email);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

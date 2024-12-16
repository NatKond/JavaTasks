package org.tel.ran.Tasks._12_12_2024;

public class Company {
    private int id;
    private String name;
    private String address;
    private Department[] departments;

    public Company(int id, String name, String address, Department[] departments) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.departments = departments;
    }

    public Company(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Company() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Employee getMaxSalaryEmployee(){
        Employee maxSalaryEmployee = this.getDepartments()[0].getEmployees()[0];
        for (int i = 0; i < this.getDepartments().length; i++) {
            Department currentDepartment = this.getDepartments()[i];
            for (int j = 0; j < currentDepartment.getEmployees().length; j++) {
            Employee currentEmployee = currentDepartment.getEmployees()[j];
            if (currentEmployee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = currentEmployee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public void compareSalaryToEmployees(Employee employee){
        for (int i = 0; i < this.getDepartments().length; i++) {
            Department currentDepartment = this.getDepartments()[i];
            for (int j = 0; j < currentDepartment.getEmployees().length; j++) {
                Employee currentEmployee = currentDepartment.getEmployees()[j];
                if (currentEmployee.getSalary() > employee.getSalary()) {
                    System.out.println("Employee = " + currentEmployee + " in " + this.getName() + " salary is higher than that of the selected employee.");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
package org.tel.ran.Tasks._19_12_2024.TasksE4;

public class Manager extends Employee{
    int teamSize;
    double bonus;

    public Manager() {
    }

    public Manager(int id, String name, String email, String position, double salary, int teamSize, double bonus) {
        super(id, name, email, position, salary);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculateTotalSalary(){
        return super.salary + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", teamSize=" + teamSize +
                ", bonus=" + bonus +


                '}';
    }
}

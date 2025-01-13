package org.tel.ran.Tasks._19_12_2024.TasksE2E3;

import java.time.LocalDate;

public class OrderStatus {
    int id;
    String status;
    LocalDate updateDate;

    public OrderStatus() {
    }

    public OrderStatus(int id, String status, LocalDate updateDate) {
        this.id = id;
        this.status = status;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}

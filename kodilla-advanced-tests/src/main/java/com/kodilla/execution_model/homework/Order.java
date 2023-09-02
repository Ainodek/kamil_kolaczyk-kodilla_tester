package com.kodilla.execution_model.homework;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Order {
    double value;
    String username;
    LocalDate date;

    public Order(double value, String username, LocalDate date) {
        this.value = value;
        this.username = username;
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", username='" + username + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

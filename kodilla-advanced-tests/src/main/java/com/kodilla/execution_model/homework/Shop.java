package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    List<Order> listOfOrders = new ArrayList<>();

    public void addOrder(Order order){
        this.listOfOrders.add(order);
    }
    public List<Order> orderFromPeriod(LocalDate from, LocalDate to){
        List<Order> period = new ArrayList<>();
        for(Order orders : listOfOrders){
            if(orders.getDate().isAfter(from) && orders.getDate().isBefore(to))
                period.add(orders);
        }
        return period;
    }
    public List<Order> orderByValues(int from, int to){
            List<Order> orderByValues = listOfOrders.stream()
                    .filter(o -> o.getValue()>from && o.getValue()<to)
                    .collect(Collectors.toList());
            return orderByValues;
            }
    public int numberOfOrders(){
        return listOfOrders.size();
    }
    public double sumOfValues(){
        int sum = 0;
        for (Order orders : listOfOrders) {
            sum += orders.value;
        }
        return sum;
    }
}


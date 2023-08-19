package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Warehouse {
    List<Order> orderList = new ArrayList<>();
    public void addOrder(Order order){
        orderList.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException{

       Order order = orderList
                .stream()
                .filter(u -> u.getNumber().equals(number))
               .findFirst()
               .orElseThrow(OrderDoesntExistException::new);
            return order;

    }
}

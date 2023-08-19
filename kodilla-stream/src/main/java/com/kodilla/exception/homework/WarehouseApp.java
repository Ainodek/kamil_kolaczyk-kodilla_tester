package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1/2023"));
        warehouse.addOrder(new Order("2/2023"));
        warehouse.addOrder(new Order("57/2023"));

            System.out.println(warehouse.getOrder("3/2023"));

    }

}

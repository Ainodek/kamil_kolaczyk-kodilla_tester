package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.internal.verification.SingleRegisteredInvocation;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    //NIE WIEM JAK PODAĆ DATĘ, ALE POZOSTAŁĄ CZĘŚĆ MYŚLĘ, ŻE ZROBIŁEM OKEJ
    Order order1 = new Order(7000, "Marian", 1999-09-01);
    Order order2 = new Order(5000, "Marek", 2000-09-01);
    Order order3 = new Order(6000, "Jola", 2001-09-01);
    Order order4 = new Order(700, "Jan", 2002-09-01);
    Order order5 = new Order(800, "Kamil", 2003-09-01);
    Order order6 = new Order(50, "Artur", 2004-09-01);

    @Test
    public void shouldIncreaseSizeOfCollection(){
        //when
        int result = shop.listOfOrders.size();
        //then
        assertEquals(3, result);
    }
    @Test
    public void shouldReturnOrdersFromPeriod(){
        //when
        List<Order> orderFromPeriod = new ArrayList<>();
        for(Order order : shop.listOfOrders){
            if(order.getDate().isBefore(2003-09-02) && order.getDate().isAfter(2001-08-30))
                orderFromPeriod.add(order);
        }
        //then
        assertEquals(3, orderFromPeriod.size());
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/Order.csv", numLinesToSkip = 1)
    public void shouldReturnOrdersWithValueRange(int input1, int input2, int expected){
        //when
        int result = shop.orderByValues(input1, input2).size();
        //then
        assertEquals(expected, result);
    }
    @Test
    public void shouldReturnSizeOfALlList(){
        //when
        int result = shop.listOfOrders.size();
        //then
        assertEquals(6, result);
    }
    @Test
    public void shouldReturnSumOfAllValue(){
        //when
        int result = 0;
        for(Order order : shop.listOfOrders){
            result += order.getValue();
        }
        //then
        assertEquals(19550, result);
    }


    @BeforeEach
    public void initializeShop(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
    }


}
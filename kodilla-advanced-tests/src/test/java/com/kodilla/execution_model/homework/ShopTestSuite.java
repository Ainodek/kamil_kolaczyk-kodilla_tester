package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.internal.verification.SingleRegisteredInvocation;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    //NIE WIEM JAK PODAC DATE ALE POZOSTALA CZESC MYSLE ZE ZROBILEM OKEJ
    Order order1 = new Order(7000, "Marian", LocalDate.of(1999, 9, 1));
    Order order2 = new Order(5000, "Marek", LocalDate.of(2000, 9, 1));
    Order order3 = new Order(6000, "Jola", LocalDate.of(2001, 9, 1));
    Order order4 = new Order(700, "Jan", LocalDate.of(2002, 9, 1));
    Order order5 = new Order(800, "Kamil", LocalDate.of(2003, 9, 1));
    Order order6 = new Order(50, "Artur", LocalDate.of(2004, 9, 1));

    @Test
    public void shouldIncreaseSizeOfCollection(){
        //when
        int result = shop.listOfOrders.size();
        //then
        assertEquals(6, result);
    }
    @Test
    public void shouldReturnOrdersFromPeriod(){
        //when
        List<Order> orderFromPeriod = new ArrayList<>();
        for(Order order : shop.listOfOrders){
            if(order.getDate().isBefore(LocalDate.of(2003, 9,2)) && order.getDate().isAfter(LocalDate.of(2001, 8, 30)))
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
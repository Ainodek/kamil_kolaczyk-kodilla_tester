package com.kosilla.spring.basic.dependency_injection.homework;

public class ShippingCenter implements NotificationService{
    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }


    public void sendPackage(String address, double weight) {
        if (deliverPackage(address, weight)) {
            success(address);
        } else {
            fail(address);
        }
    }

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}

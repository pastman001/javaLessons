package com.javalesson.interfaces;

public class Fridge extends Electronics {
    public Fridge(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calDeliveryPrice() {
        if (getPrice() >= 300) {
            return 0;
        } else {
            return 25;
        }
    }
}

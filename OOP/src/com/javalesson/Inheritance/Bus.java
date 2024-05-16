package com.javalesson.Inheritance;

public class Bus extends Auto{

    private int passengerNumber;

    public Bus(String producer, String model, EngineType engineType, int passengerNumber) {
        super(producer, model, engineType);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
    
}

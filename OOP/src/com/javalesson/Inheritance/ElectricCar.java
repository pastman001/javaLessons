package com.javalesson.Inheritance;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passengerNumber;

    public ElectricCar(String producer, String model, EngineType engineType, int batteryVolume) {
        super(producer, model, EngineType.ELECTRIC);
        this.batteryVolume = batteryVolume;
        this.passengerNumber = passengerNumber;
    }

    public void charge() {
        System.out.println("Battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}
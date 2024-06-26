package com.javalesson.Inheritance;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passengerNumber;

    public ElectricCar(String producer, String model, EngineType engineType, int batteryVolume) {
        super(producer, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passengerNumber = passengerNumber;
    }

    private void charge() {
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
    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Car is stopped");
    }

    @Override
    public void energize() {
        charge();
    }
}

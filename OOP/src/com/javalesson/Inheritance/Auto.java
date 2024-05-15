package com.javalesson.Inheritance;

public class Auto {
    private String producer = "Mercedes";
    private String model = "A180";
    private EngineType engineType;
    private int currentSpeed;
    private boolean isRunning;

    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is start");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped");
    }

    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
        System.out.println("Auto was initialized");
    }

    public void acceleration(int kmPerHour) {
        currentSpeed += kmPerHour;
        System.out.println("Accelerating speed is " + currentSpeed + " kmPerHour");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }
}

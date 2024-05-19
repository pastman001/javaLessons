package com.javalesson.Inheritance;

public class Auto {
    private String producer = "Mercedes";
    private String model = "A180";
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;

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

    public Auto(String producer, String model, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
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

    public Engine getEngineType() {
        return engine;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public Engine getEngine() {
        return engine;
    }
}

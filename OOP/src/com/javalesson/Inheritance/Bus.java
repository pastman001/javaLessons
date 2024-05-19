package com.javalesson.Inheritance;

public class Bus extends FuelAuto{

    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    public void fuelUp(){
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() +petrolVolume;
        if(volume>getTankVolume()){
            setAvailablePetrol(getTankVolume());
        }
        System.out.println("Adding DIESEL");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers (int passengerNum){
        this.passengerNumber+=passengerNum;
        System.out.println("Pick up "+passengerNum+" passengers");
    }

    public void releasePassengers (){
        if(isRunning){
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passenger released");
    }
}

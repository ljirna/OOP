package Vjezba1911.ENKAPSULACIJA;
enum TransmissionType{
    PRVI, DRUGI
}
public abstract class Vehicle {
    private FuelType fuelType;
    private TransmissionType transmissionType;
    public Vehicle(FuelType fuelType, TransmissionType transmissionType){
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void startingEngine() {

    }
    public void displayDetails(){

    }
}
class Car extends Vehicle {
    private String model;
    public Car(FuelType fuelType, TransmissionType transmissionType, String model){
        super(fuelType, transmissionType);
        this.model = model;
    }

    @Override
    public void startingEngine() {
        System.out.println("Wroom");
    }
    @Override
    public void displayDetails(){
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Transmission Type: " + getTransmissionType());
    }
}
class MainThree{
    public static void main(String[] args) {
        Car myCar = new Car(FuelType.BENZIN, TransmissionType.PRVI, "Toyota Corolla");

        // Display details of the Car
        System.out.println("Details of Car:");
        myCar.displayDetails();
        myCar.startingEngine();
    }
}
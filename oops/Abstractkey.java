package oops;


// Abstract class representing a vehicle
//we cannot create a object of the abtract class
abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // Abstract method that must be implemented by subclasses
    public abstract void displayInfo();
}

// Concrete class representing a Car, inheriting from Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Car Model: " + getModel());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Concrete class representing a Bike, inheriting from Vehicle
class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, String model, boolean hasCarrier) {
        super(brand, model);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Brand: " + getBrand());
        System.out.println("Bike Model: " + getModel());
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

// Main class to test the functionality
public class Abstractkey {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 4);
        Vehicle bike = new Bike("Yamaha", "YZF-R15", true);

        car.displayInfo();
        System.out.println();
        bike.displayInfo();
    }
}

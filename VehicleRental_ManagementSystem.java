/*You are tasked with creating a system to manage various types of vehicles in a rental service. The system should include the following concepts:

Custom Classes and Inheritance:
Create an abstract class Vehicle with properties brand, model, and year.
Create subclasses Car and Motorcycle that extend Vehicle.

Constructors and Getter/Setter Methods:
Implement constructors for all classes to initialize their properties.
Provide getter and setter methods for the properties.

Abstract Methods and Method Overriding:
Define an abstract method calculateRentalCost(int days) in Vehicle.
Override this method in Car and Motorcycle to provide specific rental cost calculations.

        Interfaces:
Create an interface Rentable with methods rentVehicle(String customerName) and returnVehicle().
Implement the Rentable interface in Car and Motorcycle.

Dynamic Method Dispatch:
In your main class, demonstrate creating instances of Car and Motorcycle, and calling their methods using a Vehicle reference.

This setup will help you practice using custom classes, constructors, getter/setter methods, inheritance, abstract classes, interfaces, and dynamic method dispatch.*/

abstract class Vehicle implements Rentable{
    String brand;
    String model;
    String type;
    int year;

    Vehicle(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
    }

    abstract void vehicleType();
    abstract String getVehicleType();
}

class Car extends Vehicle implements Rentable{
    String category;//4seater, 6seater etc...

    Car(String brand, String model, int year){
        super(brand, model, year);
    }

    void category(String category){this.category=category;};
    void vehicleType(){type = "4 Wheeler";}
    String getVehicleType(){return type;}

    @Override
    public void rentVehicle(String name, int rentalPeriod) {
        System.out.println("Thanks for renting, you are to return the car "+rentalPeriod+" days later.");
    }

    @Override
    public void returnVehicle(String name) {
        System.out.println(name+" Thanks for returning the vehicle on time");
    }
}

class MotorCycle extends Vehicle implements Rentable{
    MotorCycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    void vehicleType(){this.type="2 Wheeler";}
    @Override
    String getVehicleType() {return type;}

    @Override
    public void rentVehicle(String name, int rentalPeriod) {
        System.out.println("Thanks for renting, you are to return the car "+rentalPeriod+" days later.");
    }

    @Override
    public void returnVehicle(String name) {
        System.out.println(name+" Thanks for returning the vehicle on time");
    }
}

interface Rentable {
    void rentVehicle(String name, int rentalPeriod);
    void returnVehicle(String name);
}
public class VehicleRental_ManagementSystem {

    public static void main(String[] args) {
        Vehicle Thar = new Car("Mahindra", "xy700", 2022);
        Vehicle Hayabusa = new MotorCycle("Suzuki", "GSX1300R", 1999);
        Hayabusa.vehicleType();
        System.out.println(Hayabusa.getVehicleType());
        Hayabusa.display();
        Hayabusa.rentVehicle("Souhardya", 10);

        Thar.vehicleType();
        System.out.println(Thar.getVehicleType());
        Thar.display();
        Thar.returnVehicle("Souhardya");
    }
}

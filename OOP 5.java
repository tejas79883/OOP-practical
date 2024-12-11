/*
Design and develop a context for given case study 
and implement an interface for Vehicles Consider the
example of vehicles like bicycle, car, and bike.
All Vehicles have common functionalities such as
Gear Change, Speed up and apply breaks .Make an interface
and put all these common functionalities. Bicycle, Bike,
Car classes should be implemented for all
these functionalities in their own class in their own way.
*/
interface Vehicle {
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
    }
    class Bicycle implements Vehicle {
    private int gear;
    private int speed;
    public Bicycle() {
    gear = 1;
    speed = 0;
    }
    @Override
    public void changeGear(int newGear) {
    gear = newGear;
    }
    @Override
    public void speedUp(int increment) {
    speed += increment;
    }
    @Override
    public void applyBrakes(int decrement) {
    speed -= decrement;
    }
    public void displayInfo() {
    System.out.println("Bicycle - Gear: " + gear + ", Speed: " + speed + " km/h");
    }
    }
    class Bike implements Vehicle {
    private int gear;
    private int speed;
    public Bike() {
    gear = 1;
    speed = 0;
    }
    @Override
    public void changeGear(int newGear) {
    gear = newGear;
    }
    @Override
    public void speedUp(int increment) {
    speed += increment;
    }
    @Override
    public void applyBrakes(int decrement) {
    speed -= decrement;
    }
    public void displayInfo() {
    System.out.println("Bike - Gear: " + gear + ", Speed: " + speed + " km/h");
    }
    }
    class Car implements Vehicle {
    private int gear;
    private int speed;
    public Car() {
    gear = 1;
    speed = 0;
    }
    @Override
    public void changeGear(int newGear) {
    gear = newGear;
    }
    @Override
    public void speedUp(int increment) {
    speed += increment;
    }
    @Override
    public void applyBrakes(int decrement) {
    speed -= decrement;
    }
    public void displayInfo() {
    System.out.println("Car - Gear: " + gear + ", Speed: " + speed + " km/h");
    }
    }
    public class Main5 {
    public static void main(String[] args) {
    Bicycle bicycle = new Bicycle();
    Bike bike = new Bike();
    Car car = new Car();
    bicycle.changeGear(3);
    bicycle.speedUp(20);
    bicycle.applyBrakes(5);
    bicycle.displayInfo();
    bike.changeGear(4);
    bike.speedUp(30);
    bike.applyBrakes(10);
    bike.displayInfo();
    car.changeGear(5);
    car.speedUp(80);
    car.applyBrakes(15);
    car.displayInfo();
    }
    }
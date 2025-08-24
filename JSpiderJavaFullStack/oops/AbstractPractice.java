package oops;
abstract class Vehicle{
    public void VehicleStuff(){
    }
    abstract public void start();
    abstract public void accelerate();
    abstract public void end();
}
class Car extends Vehicle{
    @Override
    public void VehicleStuff() {
        System.out.println("Car are more reliable than for long travel");
    }
    @Override
    public void start() {
        System.out.println("car starts");
    }
    @Override
    public void accelerate() {
        System.out.println("Car accelerate ");
    }
    @Override
    public void end() {
        System.out.println("car stops");
    }
}
class Maclaran extends Car{
    @Override
    public void VehicleStuff() {
        System.out.println("maclaran is too much speed anad has more power");
    }
    @Override
    public void start() {
        System.out.println("When maclaren starts itt feels great");
    }

    @Override
    public void accelerate() {
        System.out.println("maclaren reaches 0 to 100 in 4 seconds");
    }

    @Override
    public void end() {
        System.out.println("when maclaren stops the driver feels more gravitational forces");
    }
}
class Truck extends Vehicle{
    @Override
    public void VehicleStuff() {
        System.out.println("Truck carries more goods while traveling");
    }
    @Override
    public void start() {
        System.out.println("Truck starts");
    }
    @Override
    public void accelerate() {
        System.out.println("Truck accelerate ");
    }
    @Override
    public void end() {
        System.out.println("Truck stops");
    }
}
class Bike extends Vehicle{
    @Override
    public void VehicleStuff() {
        System.out.println("Bikes are more exiting for long travel");
    }
    @Override
    public void start() {
        System.out.println("bike starts feels good");
    }
    @Override
    public void accelerate() {
        System.out.println("Bike accelerate more faster ");
    }
    @Override
    public void end() {
        System.out.println("Bike stopping feels dangerious");
    }
}
public class AbstractPractice {
    public static void main(String[] args) {
        Vehicle maclaran = new Bike();
        maclaran.VehicleStuff();
        maclaran.start();
        maclaran.accelerate();
        maclaran.end();
    }
}
package Mock.FirstMock;

// Abstraction + Encapsulation
abstract class Vehicle {
    private String brand;  // Encapsulation (private variable)

    // Getter & Setter (Encapsulation)
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Abstract methods (Abstraction)
    abstract void start();
    abstract void stop();
}

// Inheritance + Polymorphism (Overriding)
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println(getBrand() + " Car is starting with key ignition...");
    }

    @Override
    void stop() {
        System.out.println(getBrand() + " Car stopped.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println(getBrand() + " Bike is starting with self start...");
    }

    @Override
    void stop() {
        System.out.println(getBrand() + " Bike stopped.");
    }
}

// Interface (Complete Abstraction)
interface MusicPlayer {
    void playMusic();
}

// LuxuryCar extends Car + implements MusicPlayer
class LuxuryCar extends Car implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println(getBrand() + " Luxury Car is playing music...");
    }
}

// Compile-time Polymorphism (Method Overloading)
class Driver {
    void drive(Car c) {
        System.out.println("Driving a Car...");
    }

    void drive(Bike b) {
        System.out.println("Riding a Bike...");
    }
}
// Main Class
public class VehicleDemo {
    public static void main(String[] args) {
        // Upcasting (Parent reference -> Child object)
        Vehicle v1 = new Car();
        v1.setBrand("Toyota");
        v1.start();   // Car start() called
        v1.stop();

        Vehicle v2 = new Bike();
        v2.setBrand("Royal Enfield");
        v2.start();   // Bike start() called
        v2.stop();

        // Using Interface with LuxuryCar
        Vehicle v3 = new LuxuryCar();  // Upcasting
        v3.setBrand("BMW");
        v3.start();

        // Downcasting to access MusicPlayer feature
        LuxuryCar lc = (LuxuryCar) v3;
        lc.playMusic();
        lc.stop();

        // Compile-time Polymorphism (Overloading)
        Driver d = new Driver();
        d.drive(new Car());
        d.drive(new Bike());
    }
}

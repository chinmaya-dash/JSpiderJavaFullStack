package oops.Downcasting;

import java.util.Scanner;

class Vehicle{
    public void vehicleStuff(){
    }
    public void start(){    }
    public  void ascelerate(){}
    public void stop(){}
}
class Bike extends Vehicle{

    public void vehicleStuff(){
        System.out.println("every vehicle has these features \n1 - Used for transport\n2 - it cause polution");
    }
    public void start(){
        System.out.println(" Bike starts");
    }
    public  void ascelerate(){
        System.out.println("Bike Ascelerates");
    }
    public void stop(){
        System.out.println("Bike stops");
    }
}
class BMW extends Vehicle{

    public void vehicleStuff(){
        System.out.println("every vehicle has these features \n1 - Used for transport\n2 - it cause polution");
    }
    public void start(){
        System.out.println(" BMW starts");
    }
    public  void ascelerate(){
        System.out.println("BMW Ascelerates");
    }
    public void stop(){
        System.out.println("BMW stops");
    }
}

class Audi extends Vehicle{

    public void vehicleStuff(){
        System.out.println("every vehicle has these features \n1 - Used for transport\n2 - it cause polution");
    }
    public void start(){
        System.out.println(" AUDI starts");
    }
    public  void ascelerate(){
        System.out.println("Audi Ascelerates");
    }
    public void stop(){
        System.out.println("audi stops");
    }
}
class Drive{
    public static void drive(Vehicle v){
    v.vehicleStuff();
    if (v instanceof Bike){
        v.start();
        v.ascelerate();
        v.stop();
    } else if (v instanceof Audi) {
        v.start();
        v.ascelerate();
        v.stop();
    } else if (v instanceof BMW) {
        v.start();
        v.ascelerate();
        v.stop();
    }else {
        v.vehicleStuff();
    }
    }
}
public class test {
    public Vehicle getVehicle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for Bike\n2 for BMW\n3 for Audi");
        int choice = sc.nextInt();
        if (choice == 1) return new Bike();
        else if (choice == 2) return new BMW();
        else if (choice == 3) return new Audi();
        else {
            System.out.println("Invalid Choice");
            return getVehicle();
        }
    }
    public static void main(String[] args) {
        test t = new test();
        Drive d = new Drive();
        d.drive(t.getVehicle());
    }
}


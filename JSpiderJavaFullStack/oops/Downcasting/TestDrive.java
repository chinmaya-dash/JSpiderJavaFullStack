package oops.Downcasting;

import java.util.Scanner;

public class TestDrive {
    public static void Drive(vehiclee v) {
        v.start();
        v.accelerate();
        v.stop();

        if (v instanceof BMWw) ((BMWw) v).autopilot();
        else if (v instanceof AUDI) ((AUDI) v).ABS();
        else if (v instanceof BENZ) ((BENZ) v).GPS();
    }

    public static vehiclee getVehicle(Scanner sc) {
        System.out.println("Enter 1 for BMW\n2 for Audi\n3 for BENZ");
        int n = sc.nextInt();

        if (n == 1) return new BMWw();
        else if (n == 2) return new AUDI();
        else if (n == 3) return new BENZ();
        else {
            System.out.println("Invalid choice, try again.");
            return getVehicle(sc);  // recursion until valid choice
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drive(getVehicle(sc));
        sc.close();
    }
}

// -------------------- Abstract Class --------------------
abstract class vehiclee {
    abstract public void start();
    abstract public void accelerate();
    abstract public void stop();
}

// -------------------- BMW --------------------
class BMWw extends vehiclee {
    @Override
    public void start() {
        System.out.println("BMW started");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW accelerating...");
    }

    @Override
    public void stop() {
        System.out.println("BMW stopped");
    }

    public void autopilot() {
        System.out.println("BMW has Autopilot feature");
    }
}
// -------------------- Audi --------------------
class AUDI extends vehiclee {
    @Override
    public void start() {
        System.out.println("Audi started");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi accelerating...");
    }

    @Override
    public void stop() {
        System.out.println("Audi stopped");
    }

    public void ABS() {
        System.out.println("Audi has perfect ABS");
    }
}

// -------------------- BENZ --------------------
class BENZ extends vehiclee {
    @Override
    public void start() {
        System.out.println("BENZ started");
    }

    @Override
    public void accelerate() {
        System.out.println("BENZ accelerating...");
    }

    @Override
    public void stop() {
        System.out.println("BENZ stopped");
    }

    public void GPS() {
        System.out.println("BENZ has GPS feature");
    }
}

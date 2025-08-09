package FactoryMethode;

import java.util.Scanner;
class nonRelated{
    String name;
    int age;
    long phoneNumber;
    String state;
}

class Page {
    String name;
    String number;
    String password;
    String email;

    // Factory method for login
    static Page login() {
        Scanner sc = new Scanner(System.in);
        Page p = new Page();

        System.out.println("----- Login -----");
        System.out.print("Enter your name: ");
        p.name = sc.nextLine();

        System.out.print("Enter your number: ");
        p.number = sc.nextLine();

        System.out.print("Enter your password: ");
        p.password = sc.nextLine();

        System.out.print("Enter your email: ");
        p.email = sc.nextLine();

        return p;
    }

    // Factory method for registration
    static Page register() {
        Scanner sc = new Scanner(System.in);
        Page p = new Page();

        System.out.println("----- Registration -----");
        System.out.print("Enter your name: ");
        p.name = sc.nextLine();

        System.out.print("Enter your number: ");
        p.number = sc.nextLine();

        System.out.print("Enter your password: ");
        p.password = sc.nextLine();

        System.out.print("Enter your email: ");
        p.email = sc.nextLine();

        return p;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
    }
}

public class page {
    public static void main(String[] args) {
        // Using factory method for registration
        Page registeredUser = Page.register();
        System.out.println("\nUser Registered Successfully!");
        registeredUser.displayDetails();

        // Using factory method for login
        Page loggedInUser = Page.login();
        System.out.println("\nUser Logged In Successfully!");
        loggedInUser.displayDetails();



//        NotRelated To Factory Methode
//        Scanner sc = new Scanner(System.in);
//        nonRelated nr = new nonRelated();
//
//        System.out.print("Enter your name: ");
//        String name = nr.name = sc.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age  = nr.age = sc.nextInt();
//
//        System.out.print("Enter your number: ");
//        long Number = nr.phoneNumber = sc.nextLong();
//
//        System.out.print("Enter your State: ");
//        String state = nr.state = sc.next();
//
//        System.out.println("----- for local variables int main -----");
//        System.out.println(name+"\n"+age+"\n"+Number+"\n"+state);
//
//        System.out.println("----- for nonRelated nonstatic variables  variables -----");
//        System.out.println("Normally ");
//        System.out.println(nr.name+"\n"+nr.age+"\n"+nr.phoneNumber+"\n"+nr.state);
    }
}

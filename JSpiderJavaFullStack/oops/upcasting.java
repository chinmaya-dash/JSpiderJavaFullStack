package oops;


class Car{

}
class Audi extends Car{

}
class Bmw extends Car{

}
class Driver{
    public static void Drive(Car c){
//        if (c instanceof Audi ){
//            Audi A = (Audi) c;
//            System.out.println("The driver know's hoe to drive a Audi Car");
//        } else if (c instanceof Bmw) {
//            Bmw A = (Bmw) c;
//            System.out.println("The driver know's hoe to drive a Bmw Car");
//        }else
        System.out.println("The driver know's hoe to drive a  Car");
    }
}
public class upcasting {

    public static void main(String[] args) {
        Driver d = new Driver();
        d.Drive(new Car());
        d.Drive(new Audi());
        d.Drive(new Bmw());

    }
}

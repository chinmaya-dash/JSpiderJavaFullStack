public class car {
    String Model;
    String Color;
    int Year;
    int price;
    int Speed;

    public void accelerate(int n){
        Speed = Speed+n;
    }
}

 class toyota {
    public static void main(String[] arg){
 car myCar = new car();

        System.out.println(myCar.Speed);
        myCar.Model =  "Toyota Corolla";
        myCar.Color = "Red";
        myCar.Year = 2025;
        myCar.price = 20000;
        System.out.println("Car Model: "+myCar.Model);
        System.out.println("Car colour: "+myCar.Color);
        System.out.println("Car Year: "+myCar.Year);
        System.out.println("Car price: "+myCar.price);
        myCar.Speed = 100;
        System.out.println("Car speed: "+myCar.Speed);
        System.out.println("Accelerating the car by 50 km/h");
        myCar.accelerate(50);
        System.out.println("Car speed after Acceleration: "+myCar.Speed);

        
    }
   
}

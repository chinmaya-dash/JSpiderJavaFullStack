package oops.Downcasting;

public class downCasting {
    public static void main(String[] args) {
    spesificAnimalStuff sp = new spesificAnimalStuff();
    sp.specificanimalStuff(new babyDog());
        }
}
class spesificAnimalStuff{
    public void specificanimalStuff(Animal A){
if (A instanceof dog) {
      dog d = (dog)A;
        d.animalStuff();
        d.bark(); 
}else if(A instanceof babyDog){
babyDog b = (babyDog)A;
        b.animalStuff();
        b.bark();
        b.weep();
}
else if (A instanceof cat) {
    cat c = (cat)A;
c.animalStuff();
c.scr();
}
else{
    A.animalStuff();
}
    }
}
class Animal{
    public void animalStuff(){

        System.out.println("Animal eat\n animal poop\n animal sleep");
    }
}
class dog extends Animal{
    @Override
    public void animalStuff() {
        System.out.println("Dog eat\n Dog poop\n Dog sleep");
    }
    public void bark(){
        System.out.println("Dog shouts when needed");
    }
}
class babyDog extends dog{
      @Override
    public void animalStuff() {
        System.out.println("babyDog eat\n babydog poop\n babyDog sleep");
    }
      public void bark(){
        System.out.println("babydog woof when they are bigger");
    }
    public void weep(){
        System.out.println("Babay dog only weep when they are awake");
    }
}

class cat extends Animal{
  @Override
    public void animalStuff() {
        System.out.println("Cat eat\n Cat poop\n Cat sleep");
    }
    public void scr(){
        System.out.println("Meow");
    }
}


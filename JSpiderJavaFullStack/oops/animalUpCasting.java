package oops;

public class animalUpCasting {
    public static void main(String[] args) {
//        Animal a = new Dog();
//        a.shout();
//        a.grawl();


        SpecificAnimalStuff specificAnimalStuff = new SpecificAnimalStuff();
        specificAnimalStuff.specificanimalstuf(new Animal()); // Animal
        specificAnimalStuff.specificanimalstuf(new Dog());    // Dog
        specificAnimalStuff.specificanimalstuf(new Cat());    // Cat

//        Animalstuff animalstuf = new Animalstuff();
//        animalstuf.animalstuff(new Animal());
//        animalstuf.animalstuff(new Dog());
//        animalstuf.animalstuff(new Cat());
//        animalstuf.animalstuff(new Cat());
    }
}
class SpecificAnimalStuff{
    public void specificanimalstuf(Animal A){
if (A instanceof Dog){
    Dog d = (Dog) A;
    d.shout();
    d.grawl();
} else if (A instanceof Cat) {
    Cat c = (Cat) A;
    c.shout();
    c.scratch();
}else{
    A.shout();
}
    }
}
class Animalstuff{
    public  void animalstuff(Animal A){
        if (A instanceof Dog) {A.shout();}
        else if(A instanceof Cat) {A.shout();}
        else {A.shout();}
        System.out.println("Animal Eat\nAnimal Poop\nAnimal Sleep");
    }
}
class Animal{
    public  void shout(){
        System.out.println("every Animal souts");
    }
}
class Dog extends Animal{
    public  void shout(){
        System.out.println("Woof woof");
    }
    public  void grawl(){
        System.out.println("Grrrrrrr");
    }
}
class Cat extends  Animal{
    public  void shout(){
        System.out.println("cat's meow");
    }
    public  void scratch(){
        System.out.println("With cat come's scratches");
    }
}


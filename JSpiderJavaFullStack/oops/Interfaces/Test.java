package oops.Interfaces;

interface Switch {
    void on();

    void off();
}
interface Regulator{
    void increaseSpeed();
    void decreaseSpeed();
}class fan implements Switch, Regulator{
    @Override
    public void increaseSpeed() {
        System.out.println("increase the speed of fan");
    }
    @Override
    public void decreaseSpeed() {
        System.out.println("decrease the speed of fan");
    }
    @Override
    public void on() {
        System.out.println("Switch on the fan");
    }
    @Override
    public void off() {
        System.out.println("Switch off the fan");
    }
}
public class Test {
    public static void main(String[] args) {
Switch s = new fan();
s.on();
s.off();
Regulator regulator = new fan();
regulator.increaseSpeed();
regulator.increaseSpeed();

    }
}

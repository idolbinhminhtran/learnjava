package learn_oop;

public class Lamp {
    boolean isOn;
    void turnOn(){
        isOn = true;
        System.out.println("light is on");

    }
    void turnOff(){
        isOn = false;
        System.out.println("light is off");
    }

}

class Main{
    public static void main(String[] args) {
        Lamp bulb = new Lamp();
        bulb.turnOn();
    }
}


package opps.inheritance.multilevel;

/**
 * Created by JitendraSingh on 21/03/18.
 */
public class Car {

    public Car() {
        System.out.println("Car class");
    }

    public void vehicleType() {
        System.out.println("vehicle type : car");
    }
}

class Maruti extends Car {

    public Maruti() {
        System.out.println("Maruti class");
    }

    public void brand() {
        System.out.println("branch : Maruti");
    }

    public void speed() {
        System.out.println("Car speed : 90kmph");
    }
}

class Maruti800 extends Maruti {

    public Maruti800() {
        System.out.println("Maruti model: 800");
    }

    public void speed(){
        System.out.println("Maruti 800 speed : 80kmph");
    }

    public static void main(String[] args) {
        Maruti800 maruti800 = new Maruti800();
        maruti800.vehicleType();
        maruti800.speed();
        maruti800.brand();
    }
}

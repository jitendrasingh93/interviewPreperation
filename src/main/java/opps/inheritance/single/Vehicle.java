package opps.inheritance.single;

/**
 * Created by JitendraSingh on 20/03/18.
 */
 class Vehicle {

     void speed() {
        System.out.println("speed of vehicle");
    }

     void fuel() {
        System.out.println("fuel type of vehicle");
    }

}

class Car extends Vehicle {
     void model() {
        System.out.println("Car model");
    }
}

class TestInheritence {
    public static void main(String[] args) {
        System.out.println("this is the single inheritence..");
        Car car = new Car();
        car.speed();
        car.fuel();
        car.model();
    }
}

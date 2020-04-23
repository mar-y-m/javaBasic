package Lessons.HW;

import Lessons.location.*;

public class TransportHW {
    public static void transportHW(){
        Bus bus = new Bus();
        Truck truck = new Truck();
        Car car = new Car();
        bus.drive();
        bus.stop();

        truck.drive();
        truck.stop();

        car.drive();
        car.stop();
    }
}

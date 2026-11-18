interface Chargeable {
    void charge();
}

abstract class Vehicle {
    abstract void display();

    void parking() {
        System.out.println("Vehicle is Parked");
    }
}

class ElectricCar extends Vehicle implements Chargeable {
    @Override
    void display() {
        System.out.println("Electric Car");
    }

    public void charge() {
        System.out.println("Battery is Charging");
    }
}

public class Task09 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.display();
        e.parking();
        e.charge();
    }
}

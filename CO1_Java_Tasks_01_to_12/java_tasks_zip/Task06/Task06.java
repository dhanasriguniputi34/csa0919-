class Vehicle {
    String vehicleNo;

    Vehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    void display() {
        System.out.println("Vehicle No: " + vehicleNo);
    }
}

class Car extends Vehicle {
    Car(String vehicleNo) {
        super(vehicleNo);
    }

    void carType() {
        System.out.println("Vehicle Type: Car");
    }
}

class ElectricCar extends Car {
    ElectricCar(String vehicleNo) {
        super(vehicleNo);
    }

    void charging() {
        System.out.println("Electric Car Charging");
    }
}

public class Task06 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("TN03EF3333");
        e.display();
        e.carType();
        e.charging();
    }
}

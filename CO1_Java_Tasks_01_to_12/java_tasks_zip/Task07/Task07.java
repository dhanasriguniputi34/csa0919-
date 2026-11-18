class Vehicle {
    double calculateFee() {
        return 20;
    }
}

class TwoWheeler extends Vehicle {
    @Override
    double calculateFee() {
        return 10;
    }
}

class Car extends Vehicle {
    @Override
    double calculateFee() {
        return 30;
    }
}

public class Task07 {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler();
        Car car = new Car();
        System.out.println("Bike Fee: Rs " + bike.calculateFee());
        System.out.println("Car Fee: Rs " + car.calculateFee());
    }
}

class Vehicle {
    String vehicleNo;
    double rate;

    Vehicle(String vehicleNo, double rate) {
        this.vehicleNo = vehicleNo;
        this.rate = rate;
    }

    double calculateFee(int hours) {
        return hours * rate;
    }
}

public class Task11 {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("TN01AB1111", 10);
        Vehicle car = new Vehicle("TN02CD2222", 30);

        System.out.println("Bike Number: " + bike.vehicleNo);
        System.out.println("Bike Fee: Rs " + bike.calculateFee(2));
        System.out.println("Car Number: " + car.vehicleNo);
        System.out.println("Car Fee: Rs " + car.calculateFee(3));

        double total = bike.calculateFee(2) + car.calculateFee(3);
        System.out.println("Total Collection: Rs " + total);
    }
}

class Vehicle {
    String vehicleNo;
    String type;

    Vehicle(String vehicleNo, String type) {
        this.vehicleNo = vehicleNo;
        this.type = type;
    }

    void display() {
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Vehicle Type: " + type);
    }
}

class ParkingSlot {
    int slotNo;
    boolean occupied;

    ParkingSlot(int slotNo) {
        this.slotNo = slotNo;
        occupied = false;
    }

    void park() {
        occupied = true;
        System.out.println("Vehicle Parked");
    }
}

public class Task01 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("TN01AB1111", "Car");
        ParkingSlot s = new ParkingSlot(1);
        v.display();
        s.park();
    }
}

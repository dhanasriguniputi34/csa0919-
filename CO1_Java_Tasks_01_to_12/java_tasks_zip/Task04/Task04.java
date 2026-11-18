class ParkingTicket {
    int ticketNo;
    String vehicleNo;

    ParkingTicket() {
        this(101, "TN01AB1111");
    }

    ParkingTicket(int ticketNo, String vehicleNo) {
        this.ticketNo = ticketNo;
        this.vehicleNo = vehicleNo;
    }

    void display() {
        System.out.println("Ticket No: " + ticketNo);
        System.out.println("Vehicle No: " + vehicleNo);
    }
}

public class Task04 {
    public static void main(String[] args) {
        ParkingTicket t1 = new ParkingTicket();
        ParkingTicket t2 = new ParkingTicket(102, "TN02CD2222");
        t1.display();
        t2.display();
    }
}

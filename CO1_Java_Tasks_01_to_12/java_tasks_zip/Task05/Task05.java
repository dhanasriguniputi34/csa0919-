class ParkingTicket {
    static int count = 100;
    int ticketNo;

    ParkingTicket() {
        ticketNo = ++count;
    }

    void display() {
        System.out.println("Ticket Number: " + ticketNo);
    }

    static void showCount() {
        System.out.println("Total Tickets: " + (count - 100));
    }
}

public class Task05 {
    public static void main(String[] args) {
        ParkingTicket t1 = new ParkingTicket();
        ParkingTicket t2 = new ParkingTicket();
        ParkingTicket t3 = new ParkingTicket();
        t1.display();
        t2.display();
        t3.display();
        ParkingTicket.showCount();
    }
}

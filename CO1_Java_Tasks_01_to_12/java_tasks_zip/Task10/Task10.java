class ParkingSlot {
    private int slotNo;
    private boolean occupied;

    public void setSlotNo(int slotNo) {
        if (slotNo > 0) {
            this.slotNo = slotNo;
        } else {
            System.out.println("Invalid Slot Number");
        }
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean getOccupied() {
        return occupied;
    }
}

public class Task10 {
    public static void main(String[] args) {
        ParkingSlot p = new ParkingSlot();
        p.setSlotNo(5);
        p.setOccupied(true);
        System.out.println("Slot Number: " + p.getSlotNo());
        System.out.println("Occupied: " + p.getOccupied());
    }
}

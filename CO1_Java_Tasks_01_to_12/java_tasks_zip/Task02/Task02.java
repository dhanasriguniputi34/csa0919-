public class Task02 {
    public static void main(String[] args) {
        String[][] slots = new String[2][];
        slots[0] = new String[3];
        slots[1] = new String[2];
        slots[0][0] = "TN01AB1111";
        slots[1][0] = "TN02CD2222";

        for (int i = 0; i < slots.length; i++) {
            for (int j = 0; j < slots[i].length; j++) {
                System.out.println("Floor: " + i + " Slot: " + j
                        + " Vehicle: " + slots[i][j]);
            }
        }
    }
}

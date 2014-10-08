package Model;

/**
 * Created by jony on 07.10.14.
 */
public class Matrix {

    public static final int SIZE = 10;

    private Slot[][] slots;

    public Matrix() {
        slots = new Slot[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                slots[i][j] = new Slot();
                slots[i][j].setMark(Slot.SlotMark.EMPTY);
            }
        }
    }

    public Slot[][] getSlots() {
        return slots;
    }


}
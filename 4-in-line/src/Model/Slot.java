package Model;

/**
 * Created by jony on 08.10.14.
 */
public class Slot {

    public enum SlotMark { X, O, EMPTY };

    private Coordinate coordinate;
    private SlotMark mark;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public SlotMark getMark() {
        return mark;
    }

    public void setMark(SlotMark mark) {
        this.mark = mark;
    }
}
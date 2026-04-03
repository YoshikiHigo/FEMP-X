package inequivalent;

public class ClonePair11004 {

    boolean method1(int x, int y) {
        return (x >= 0 && x <= 9) && (y >= 0 && y <= 9);
    }

    boolean method2(int row, int column) {
        return row >= 0 && row < 15 && column >= 0 && column < 15;
    }
}

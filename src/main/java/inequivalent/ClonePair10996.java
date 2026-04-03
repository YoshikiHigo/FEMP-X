package inequivalent;

public class ClonePair10996 {

    boolean method1(int row, int col) {
        return col == 1 || col == 4 || col == 5;
    }

    boolean method2(int row, int col) {
        return col > 0 && col < 7;
    }
}

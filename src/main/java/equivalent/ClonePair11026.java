package equivalent;

public class ClonePair11026 {
    boolean method1(int row, int col) {
        return (col == 0) || (col == 1) || (col == 2);
    }

    boolean method2(int row, int column) {
        if (column == 0) {
            return true;
        } else if (column == 1) {
            return true;
        } else return column == 2;
    }
}

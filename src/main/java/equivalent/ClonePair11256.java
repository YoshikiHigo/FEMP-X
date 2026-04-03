package equivalent;

public class ClonePair11256 {
    boolean method1(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return true;
            case 3:
                return false;
            case 4:
                return false;
            default:
                return false;
        }
    }

    boolean method2(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
            case 2:
                return true;
            case 1:
            case 3:
            default:
                return false;
        }
    }
}

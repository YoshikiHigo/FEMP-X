package equivalent;

public class ClonePair11149 {
    boolean method1(int X, int Y) {
        if (X % 2 == 0) {
            return Y % 2 != 0;
        } else {
            return Y % 2 == 0;
        }
    }

    boolean method2(int i, int j) {
        return (i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0);
    }
}

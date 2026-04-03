package equivalent;

public class ClonePair5324 {
    boolean method1(int yyyy) {
        if ((yyyy % 4) != 0) {
            return false;
        } else if ((yyyy % 400) == 0) {
            return true;
        } else return (yyyy % 100) != 0;
    }

    boolean method2(int y) {
        if (y % 100 == 0) return (y % 400 == 0);
        else return (y % 4 == 0);
    }
}

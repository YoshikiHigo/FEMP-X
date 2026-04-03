package equivalent;

public class ClonePair5594 {
    boolean method1(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    boolean method2(int i) {
        if (i % 4 != 0) {
            return false;
        }
        if (i % 400 == 0) {
            return true;
        }
        return i % 100 != 0;
    }
}

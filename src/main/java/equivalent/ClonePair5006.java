package equivalent;

public class ClonePair5006 {
    boolean method1(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        return (year % 100 != 0);
    }

    boolean method2(int year) {
        if (year % 4 != 0) return false;
        if (year % 400 == 0) return true;
        return year % 100 != 0;
    }
}

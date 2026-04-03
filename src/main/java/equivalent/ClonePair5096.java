package equivalent;

public class ClonePair5096 {
    boolean method1(int year) {
        if (year % 4 != 0) {
            return false;
        } else {
            return (year % 100 != 0) || (year % 400 == 0);
        }
    }

    boolean method2(int year) {
        if ((year % 100) == 0) return ((year % 400) == 0);
        return ((year % 4) == 0);
    }
}

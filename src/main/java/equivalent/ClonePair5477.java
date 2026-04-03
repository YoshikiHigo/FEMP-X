package equivalent;

public class ClonePair5477 {
    boolean method1(int year) {
        if (year % 400 == 0) return true;
        else if (year % 100 == 0) return false;
        else return year % 4 == 0;
    }

    boolean method2(int year) {
        boolean result = ((year % 4) == 0) && (((year % 100) != 0) || ((year % 400) == 0));
        return result;
    }
}

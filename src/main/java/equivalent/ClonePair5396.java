package equivalent;

public class ClonePair5396 {
    boolean method1(int year) {
        return (year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0);
    }

    boolean method2(int year) {
        if (year % 400 == 0) return true;
        if (year % 4 == 0) return year % 100 != 0;
        else return false;
    }
}

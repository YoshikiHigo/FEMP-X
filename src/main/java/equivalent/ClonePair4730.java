package equivalent;

public class ClonePair4730 {
    boolean method1(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    boolean method2(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 != 0) return true;
        return year % 400 == 0;
    }
}

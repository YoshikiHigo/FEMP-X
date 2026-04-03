package equivalent;

public class ClonePair5874 {
    boolean method1(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0);
    }

    boolean method2(int year) {
        if ((year & 0x03) != 0) return false;
        if (0 == (year % 100)) {
            return (year % 400) == 0;
        }
        return true;
    }
}

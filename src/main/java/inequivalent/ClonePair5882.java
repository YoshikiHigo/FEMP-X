package inequivalent;

public class ClonePair5882 {

    boolean method1(int year) {
        if (year % 4 == 0) {
            if (year < 1583) return true;
            else {
                return (year % 100 != 0) || (year % 400 == 0);
            }
        } else {
            return false;
        }
    }

    boolean method2(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}

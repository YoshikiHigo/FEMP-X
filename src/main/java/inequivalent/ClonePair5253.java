package inequivalent;

public class ClonePair5253 {

    boolean method1(int year) {
        if (year <= 1752) {
            int r = year % 4;
            return r == 0;
        } else {
            if (year % 400 == 0) {
                return true;
            } else {
                if (year % 100 == 0) {
                    return false;
                } else {
                    return year % 4 == 0;
                }
            }
        }
    }

    boolean method2(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}

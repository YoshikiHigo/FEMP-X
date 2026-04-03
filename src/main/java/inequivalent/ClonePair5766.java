package inequivalent;

public class ClonePair5766 {

    boolean method1(int yearNum) {
        boolean isLeep = false;
        if ((yearNum % 4 == 0) && (yearNum % 100 != 0)) {
            isLeep = true;
        } else isLeep = yearNum % 400 == 0;
        return isLeep;
    }

    boolean method2(int year) {
        if (year >= 1582) {
            return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
        } else {
            return (year % 4 == 0);
        }
    }
}

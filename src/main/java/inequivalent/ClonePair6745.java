package inequivalent;

import java.util.Calendar;

public class ClonePair6745 {

    int method1(int month, int year) {
        month++;
        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
            return 31;
        } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            return 30;
        } else {
            if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
                return 29;
            } else {
                return 28;
            }
        }
    }

    int method2(int month, int year) {
        switch (month) {
            case Calendar.JANUARY:
            case Calendar.MARCH:
            case Calendar.MAY:
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.OCTOBER:
            case Calendar.DECEMBER:
                return 31;
            case Calendar.APRIL:
            case Calendar.JUNE:
            case Calendar.SEPTEMBER:
            case Calendar.NOVEMBER:
                return 30;
            default:
                return year % 4 == 0 ? 29 : 28;
        }
    }
}

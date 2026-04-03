package inequivalent;

import java.util.Date;

public class ClonePair5176 {

    int method1(Date date) {
        switch (date.getMonth() + 1) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                if ((date.getYear() + 1900) % 4 == 0) return 29;
                else return 28;
        }
    }

    int method2(Date d) {
        final int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = d.getMonth();
        int year = d.getYear();
        int days = daysPerMonth[month];
        if (month == 1) {
            if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
                days++;
            }
        }
        return days;
    }
}

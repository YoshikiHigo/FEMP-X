package inequivalent;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClonePair8781 {

    int method1(Calendar calendar) {
        int month = calendar.get(Calendar.MONTH);
        if (month == Calendar.JANUARY || month == Calendar.MARCH || month == Calendar.MAY || month == Calendar.JULY || month == Calendar.AUGUST || month == Calendar.OCTOBER || month == Calendar.DECEMBER) {
            return 31;
        } else if (month == Calendar.APRIL || month == Calendar.JUNE | month == Calendar.SEPTEMBER || month == Calendar.NOVEMBER) {
            return 30;
        } else {
            GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
            if (cal.isLeapYear(calendar.get(Calendar.YEAR))) {
                return 29;
            } else {
                return 28;
            }
        }
    }

    int method2(Calendar cal) {
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            if (year % 4 == 0) {
                return 29;
            } else {
                return 28;
            }
        }
    }
}

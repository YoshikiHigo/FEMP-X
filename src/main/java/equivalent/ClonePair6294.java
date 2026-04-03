package equivalent;

import java.util.Calendar;

public class ClonePair6294 {
    int method1(int day) {
        switch (day) {
            case Calendar.TUESDAY:
                return 1;
            case Calendar.WEDNESDAY:
                return 2;
            case Calendar.THURSDAY:
                return 3;
            case Calendar.FRIDAY:
                return 4;
            case Calendar.SATURDAY:
                return 5;
            case Calendar.SUNDAY:
                return 6;
            default:
                return 0;
        }
    }

    int method2(int dayOfWeek) {
        int result = 0;
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                result = 0;
                break;
            case Calendar.TUESDAY:
                result = 1;
                break;
            case Calendar.WEDNESDAY:
                result = 2;
                break;
            case Calendar.THURSDAY:
                result = 3;
                break;
            case Calendar.FRIDAY:
                result = 4;
                break;
            case Calendar.SATURDAY:
                result = 5;
                break;
            case Calendar.SUNDAY:
                result = 6;
                break;
        }
        return result;
    }
}

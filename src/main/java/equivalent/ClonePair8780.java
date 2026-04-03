package equivalent;

import java.util.Calendar;

public class ClonePair8780 {
    int method1(Calendar cal) {
        final int year = cal.get(Calendar.YEAR);
        final int week = cal.get(Calendar.WEEK_OF_YEAR);
        final int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        if (week == 1 && dayOfMonth > 20) {
            return year + 1;
        }
        if (week >= 52 && dayOfMonth < 10) {
            return year - 1;
        }
        return year;
    }

    int method2(Calendar cal) {
        int year = cal.get(Calendar.YEAR);
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        if (week == 1 && dayOfMonth > 20) return year + 1;
        if (week >= 52 && dayOfMonth < 10) return year - 1;
        return year;
    }
}

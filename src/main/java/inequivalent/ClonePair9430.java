package inequivalent;

import java.util.Calendar;

public class ClonePair9430 {

    String method1(Calendar cal) {
        String dayName = "";
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) dayName = "Mon";
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) dayName = "Tue";
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) dayName = "Wed";
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) dayName = "Thu";
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) dayName = "Fri";
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) dayName = "Sat";
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) dayName = "Sun";
        return dayName;
    }

    String method2(Calendar calendar) {
        String str;
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                str = "Sun";
                break;
            case Calendar.MONDAY:
                str = "Mon";
                break;
            case Calendar.TUESDAY:
                str = "Tue";
                break;
            case Calendar.WEDNESDAY:
                str = "Wed";
                break;
            case Calendar.THURSDAY:
                str = "Thu";
                break;
            case Calendar.FRIDAY:
                str = "Fri";
                break;
            case Calendar.SATURDAY:
                str = "Sat";
                break;
            default:
                str = Integer.toString(calendar.get(Calendar.DAY_OF_WEEK));
        }
        return str;
    }
}

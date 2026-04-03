package equivalent;

import java.util.Calendar;

public class ClonePair7923 {
    boolean method1(Calendar dateToCheck) {
        int dayOfWeek = dateToCheck.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
    }

    boolean method2(Calendar date) {
        return date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
    }
}

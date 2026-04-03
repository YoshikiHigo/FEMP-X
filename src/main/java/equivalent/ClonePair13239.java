package equivalent;

import java.util.Calendar;

public class ClonePair13239 {
    boolean method1(Calendar date1, Calendar date2) {
        if (date1 == null || date2 == null) {
            return false;
        }
        if (date1.get(Calendar.YEAR) != date2.get(Calendar.YEAR)) {
            return false;
        }
        if (date1.get(Calendar.MONTH) != date2.get(Calendar.MONTH)) {
            return false;
        }
        return date1.get(Calendar.DAY_OF_MONTH) == date2.get(Calendar.DAY_OF_MONTH);
    }

    boolean method2(Calendar one, Calendar two) {
        if (one != null && two != null) {
            return one.get(Calendar.YEAR) == two.get(Calendar.YEAR) && one.get(Calendar.DAY_OF_YEAR) == two.get(Calendar.DAY_OF_YEAR);
        }
        return false;
    }
}

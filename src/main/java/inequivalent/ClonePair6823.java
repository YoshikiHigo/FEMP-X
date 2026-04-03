package inequivalent;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair6823 {

    boolean method1(Date date) {
        boolean isToday = false;
        if (date != null) {
            Calendar today = Calendar.getInstance();
            Calendar check = Calendar.getInstance();
            check.setTime(date);
            isToday |= (today.get(Calendar.ERA) == check.get(Calendar.ERA)) && (today.get(Calendar.YEAR) == check.get(Calendar.YEAR)) && (today.get(Calendar.DAY_OF_YEAR) == check.get(Calendar.DAY_OF_YEAR));
        }
        return isToday;
    }

    boolean method2(Date data) {
        if (data == null) {
            return false;
        }
        Calendar cal = GregorianCalendar.getInstance();
        Calendar calCurrent = GregorianCalendar.getInstance();
        cal.setTime(data);
        calCurrent.setTime(new Date());
        return cal.get(Calendar.MONTH) == calCurrent.get(Calendar.MONTH) && cal.get(Calendar.YEAR) == calCurrent.get(Calendar.YEAR);
    }
}

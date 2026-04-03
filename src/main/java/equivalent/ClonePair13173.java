package equivalent;

import java.util.Calendar;

public class ClonePair13173 {
    boolean method1(Calendar cal1, Calendar cal2) {
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
    }

    boolean method2(Calendar c1, Calendar c2) {
        return (c1.get(Calendar.DATE) == c2.get(Calendar.DATE)) && (c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH)) && (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR));
    }
}

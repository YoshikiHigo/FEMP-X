package equivalent;

import java.util.Calendar;
import java.util.Date;

public class ClonePair9040 {
    int method1(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        int cal1Year = cal1.get(Calendar.YEAR);
        int cal2Year = cal2.get(Calendar.YEAR);
        int cal1Day = cal1.get(Calendar.DAY_OF_YEAR);
        int cal2Day = cal2.get(Calendar.DAY_OF_YEAR);
        if (cal1Year < cal2Year) {
            return -1;
        }
        if ((cal1Year == cal2Year) && (cal1Day < cal2Day)) {
            return -1;
        }
        if (cal1Year > cal2Year) {
            return 1;
        }
        if ((cal1Year == cal2Year) && (cal1Day > cal2Day)) {
            return 1;
        }
        return 0;
    }

    int method2(Date srcDate, Date descDate) {
        Calendar srcDateC = Calendar.getInstance();
        srcDateC.setTime(srcDate);
        Calendar descDateC = Calendar.getInstance();
        descDateC.setTime(descDate);
        int srcYear = srcDateC.get(Calendar.YEAR);
        int descYear = descDateC.get(Calendar.YEAR);
        if (srcYear == descYear) {
            int srcDayOfYear = srcDateC.get(Calendar.DAY_OF_YEAR);
            int descDayOfYear = descDateC.get(Calendar.DAY_OF_YEAR);
            if (srcDayOfYear == descDayOfYear) {
                return 0;
            } else {
                return srcDayOfYear > descDayOfYear ? 1 : -1;
            }
        } else {
            return srcYear > descYear ? 1 : -1;
        }
    }
}

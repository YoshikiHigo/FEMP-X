package equivalent;

import java.util.Date;

public class ClonePair9059 {
    int method1(Date date, Date date2) {
        if ((date != null) && (date2 == null)) {
            return -1;
        } else if ((date == null) && (date2 != null)) {
            return 1;
        } else if ((date == null) && (date2 == null)) {
            return 0;
        }
        long time = date.getTime();
        long time2 = date2.getTime();
        if (time == time2) {
            return 0;
        } else if (time < time2) {
            return -1;
        } else {
            return 1;
        }
    }

    int method2(Date d1, Date d2) {
        if (d1 == null && d2 == null) return 0;
        else if (d1 == null) return 1;
        else if (d2 == null) return -1;
        if (d1.getTime() > d2.getTime()) return 1;
        else if (d1.getTime() < d2.getTime()) return -1;
        else return 0;
    }
}

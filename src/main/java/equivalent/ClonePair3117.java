package equivalent;

import java.util.Date;

public class ClonePair3117 {
    int method1(Object obj1, Object obj2) {
        Date date1 = (Date) obj1;
        Date date2 = (Date) obj2;
        int result = 0;
        if (date1.before(date2)) {
            result = -1;
        } else if (date1.after(date2)) {
            result = 1;
        }
        return result;
    }

    int method2(Object o1, Object o2) {
        Date o1Date = (Date) o1;
        Date o2Date = (Date) o2;
        if ((o1Date).before(o2Date)) {
            return -1;
        } else if (o1Date.getTime() == o2Date.getTime()) {
            return 0;
        } else {
            return 1;
        }
    }
}

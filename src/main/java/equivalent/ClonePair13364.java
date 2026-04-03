package equivalent;

import java.util.Date;

public class ClonePair13364 {
    Date method1(Date a, Date b) {
        if (a == null || b == null) return null;
        if (a.compareTo(b) > 0) return a;
        return b;
    }

    Date method2(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            return null;
        }
        return date1.compareTo(date2) > 0 ? date1 : date2;
    }
}

package equivalent;

import java.util.Calendar;

public class ClonePair13244 {
    boolean method1(Calendar hora1, Calendar hora2) {
        if (hora1 == null || hora2 == null) {
            return false;
        }
        int h1 = hora1.get(Calendar.HOUR_OF_DAY);
        int h2 = hora2.get(Calendar.HOUR_OF_DAY);
        int m1 = hora1.get(Calendar.MINUTE);
        int m2 = hora2.get(Calendar.MINUTE);
        if (h1 > h2) return true;
        if (h1 == h2) {
            return m1 > m2;
        }
        return false;
    }

    boolean method2(Calendar hora1, Calendar hora2) {
        if (hora1 == null || hora2 == null) {
            return false;
        }
        int h1 = hora1.get(Calendar.HOUR_OF_DAY);
        int h2 = hora2.get(Calendar.HOUR_OF_DAY);
        int m1 = hora1.get(Calendar.MINUTE);
        int m2 = hora2.get(Calendar.MINUTE);
        if (h1 > h2) {
            return true;
        }
        if (h1 == h2) {
            return m1 > m2;
        }
        return false;
    }
}

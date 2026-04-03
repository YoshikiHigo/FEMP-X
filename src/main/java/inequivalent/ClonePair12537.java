package inequivalent;

import java.util.Calendar;

public class ClonePair12537 {

    boolean method1(float val) {
        if (val == 0) {
            return false;
        }
        return (val > -Float.MIN_NORMAL) && (val < Float.MIN_NORMAL);
    }

    boolean method2(float lat) {
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        if (lat > 23.5) if ((month >= 3) && (month <= 10)) return true;
        if (lat < -23.5) return (month <= 3) && (month >= 10);
        return false;
    }
}

package equivalent;

import java.util.Calendar;

public class ClonePair9463 {
    String method1(Calendar calend) {
        String current;
        current = calend.get(Calendar.YEAR) + "-";
        if (calend.get(Calendar.MONTH) < 9) current = current + "0";
        current = current + (calend.get(Calendar.MONTH) + 1) + "-";
        if (calend.get(Calendar.DAY_OF_MONTH) < 10) current = current + "0";
        current = current + calend.get(Calendar.DAY_OF_MONTH);
        return current;
    }

    String method2(Calendar c) {
        int i = (c.get(Calendar.MONTH) + 1);
        String m;
        String d;
        if (i < 10) {
            m = "0" + i;
        } else {
            m = "" + i;
        }
        String y = "" + c.get(Calendar.YEAR);
        i = c.get(Calendar.DATE);
        if (i < 10) {
            d = "0" + i;
        } else {
            d = "" + i;
        }
        return y + "-" + m + "-" + d;
    }
}

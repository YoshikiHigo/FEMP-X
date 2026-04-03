package equivalent;

import java.util.Calendar;

public class ClonePair9495 {
    String method1(Calendar cal) {
        String r = "";
        int h = cal.get(Calendar.HOUR_OF_DAY);
        if (h < 10) r += "0" + h;
        else r += "" + h;
        int m = cal.get(Calendar.MINUTE);
        if (m < 10) r += ":0" + m;
        else r += ":" + m;
        return r;
    }

    String method2(Calendar cal) {
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        String str = null;
        if (hour < 10) str = "0" + hour;
        else str = "" + hour;
        if (minute < 10) str = str + ":0" + minute;
        else str = str + ":" + minute;
        return str;
    }
}

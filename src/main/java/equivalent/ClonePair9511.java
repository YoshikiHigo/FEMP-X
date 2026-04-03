package equivalent;

import java.util.Calendar;

public class ClonePair9511 {
    String method1(Calendar aCalendar) {
        String dateStamp = "";
        int months = aCalendar.get(Calendar.MONTH) + 1;
        if (months < 10) {
            dateStamp += "0" + months;
        } else {
            dateStamp += months;
        }
        return dateStamp;
    }

    String method2(Calendar cal) {
        int month = cal.get(Calendar.MONTH) + 1;
        if (month < 10) return "0" + month;
        else return Integer.toString(month);
    }
}

package inequivalent;

import java.util.Date;
import java.util.StringTokenizer;

public class ClonePair11457 {

    Date method1(String a) {
        if (a.equalsIgnoreCase("")) {
            return new Date();
        }
        String dateString = null;
        String hourString = null;
        if (a.indexOf(" ") > 0) {
            dateString = a.substring(0, a.indexOf(" "));
            hourString = a.substring(a.indexOf(" "));
        } else {
            dateString = a.trim();
        }
        Date date = new Date();
        StringTokenizer st = new StringTokenizer(dateString.trim(), ".");
        date.setDate(Integer.parseInt(st.nextToken()));
        date.setMonth(Integer.parseInt(st.nextToken()) - 1);
        String year = st.nextToken().trim();
        date.setYear(Integer.parseInt(year) - 1900);
        st = new StringTokenizer(hourString.trim(), ":");
        date.setHours(Integer.parseInt(st.nextToken()));
        date.setMinutes(Integer.parseInt(st.nextToken()));
        date.setSeconds(Integer.parseInt(st.nextToken()));
        return date;
    }

    Date method2(String a) {
        if (a.equalsIgnoreCase("")) {
            return new Date();
        }
        String dateString = null;
        if (a.indexOf(" ") > 0) {
            dateString = a.substring(0, a.indexOf(" "));
        } else {
            dateString = a.trim();
        }
        Date date = new Date();
        StringTokenizer st = new StringTokenizer(dateString.trim(), "-");
        String year = st.nextToken().trim();
        date.setYear(Integer.parseInt(year) - 1900);
        date.setMonth(Integer.parseInt(st.nextToken()) - 1);
        date.setDate(Integer.parseInt(st.nextToken()));
        return date;
    }
}

package inequivalent;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4319 {

    boolean method1(Date source, Date target) {
        boolean isEqual;
        isEqual = (source != null || target == null) && (source == null || target != null) && (source == null || target == null || source.equals(target));
        return isEqual;
    }

    boolean method2(Date thisDate, Date thatDate) {
        boolean result = false;
        if (thisDate == null && thatDate == null) result = true;
        else if (thisDate == null || thatDate == null) result = false;
        else {
            Calendar thisCal = Calendar.getInstance();
            Calendar thatCal = Calendar.getInstance();
            thisCal.setTime(thisDate);
            thatCal.setTime(thatDate);
            result = (thisCal.get(Calendar.YEAR) == thatCal.get(Calendar.YEAR) && thisCal.get(Calendar.MONTH) == thatCal.get(Calendar.MONTH) && thisCal.get(Calendar.DATE) == thatCal.get(Calendar.DATE));
        }
        return result;
    }
}

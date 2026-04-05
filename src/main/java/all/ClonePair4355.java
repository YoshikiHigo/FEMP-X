package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4355 {

    boolean method1(Date thisDate,Date thatDate){
      boolean result=false;
      if (thisDate == null && thatDate == null)   result=true;
     else   if (thisDate == null || thatDate == null)   result=false;
     else {
        Calendar thisCal=Calendar.getInstance();
        Calendar thatCal=Calendar.getInstance();
        thisCal.setTime(thisDate);
        thatCal.setTime(thatDate);
        result=(thisCal.get(Calendar.YEAR) == thatCal.get(Calendar.YEAR) && thisCal.get(Calendar.MONTH) == thatCal.get(Calendar.MONTH) && thisCal.get(Calendar.DATE) == thatCal.get(Calendar.DATE));
      }
      return result;
    }

    boolean method2(Date d1,Date d2){
      if (d1 != null && d2 == null) {
        return false;
      }
      if (d1 == null && d2 != null) {
        return false;
      }
      if (d1 != null) {
        if (d2 == null) {
          return false;
        }
        return (d1.compareTo(d2) == 0);
      }
      return true;
    }
}

package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4353 {

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

    boolean method2(Date date1,Date date2){
      if (date1 == null && date2 == null) {
        return true;
      }
     else   if (date1 == null || date2 == null) {
        return false;
      }
     else {
        return date1.getTime() == date2.getTime();
      }
    }
}

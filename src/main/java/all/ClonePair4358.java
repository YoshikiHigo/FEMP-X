package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4358 {

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

    boolean method2(Date a,Date b){
      if (a == null && b == null)   return true;
      if (a == null || b == null)   return false;
      return ((long)a.getTime() / 60000l) == ((long)b.getTime() / 60000l);
    }
}

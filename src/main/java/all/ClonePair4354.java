package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4354 {

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
      if (date1 == null) {
        if (date2 != null)     return false;
      }
     else {
        if (date2 == null)     return false;
        long getRidOfTime=1000 * 60 * 60* 24;
        long time1=date1.getTime() / getRidOfTime;
        long time2=date2.getTime() / getRidOfTime;
        if (time1 != time2)     return false;
      }
      return true;
    }
}

package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4357 {

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

    boolean method2(Date data1,Date data2){
      if (data1 == null && data2 == null)   return true;
      if ((data1 != null && data2 == null) || (data1 == null && data2 != null))   return false;
      return (data1.compareTo(data2) == 0);
    }
}

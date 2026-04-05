package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4392 {

    boolean method1(Date date,Date comparedDate){
      Calendar calendar=Calendar.getInstance();
      calendar.setTime(date);
      Calendar comparedCalendar=Calendar.getInstance();
      comparedCalendar.setTime(comparedDate);
      if (calendar.get(Calendar.YEAR) == comparedCalendar.get(Calendar.YEAR) && calendar.get(Calendar.MONTH) == comparedCalendar.get(Calendar.MONTH) && calendar.get(Calendar.DATE) == comparedCalendar.get(Calendar.DATE)) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(Date d1,Date d2){
      boolean result=false;
      Calendar c1=Calendar.getInstance();
      c1.setTime(d1);
      Calendar c2=Calendar.getInstance();
      c2.setTime(d2);
      if (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR) && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH)) {
        result=true;
      }
      return result;
    }
}

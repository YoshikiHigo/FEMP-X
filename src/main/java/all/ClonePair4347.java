package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4347 {

    boolean method1(Date a,Date b){
      Calendar c=Calendar.getInstance();
      Calendar c2=Calendar.getInstance();
      c.setTime(a);
      c2.setTime(b);
      c.set(Calendar.MILLISECOND,0);
      c.set(Calendar.SECOND,0);
      c.set(Calendar.MINUTE,0);
      c.set(Calendar.HOUR,0);
      c2.set(Calendar.MILLISECOND,0);
      c2.set(Calendar.SECOND,0);
      c2.set(Calendar.MINUTE,0);
      c2.set(Calendar.HOUR,0);
      if (c2.get(Calendar.YEAR) == c.get(Calendar.YEAR)) {
        if (c2.get(Calendar.MONTH) == c.get(Calendar.MONTH)) {
          if (c2.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH)) {
            return true;
          }
        }
      }
      return false;
    }

    boolean method2(Date date,Date comparedDate){
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
}

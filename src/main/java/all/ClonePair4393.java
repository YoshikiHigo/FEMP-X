package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4393 {

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

    boolean method2(Date date,Date feriado){
      boolean rtn=false;
      Calendar c=Calendar.getInstance();
      c.setTime(date);
      Calendar cfer=Calendar.getInstance();
      cfer.setTime(feriado);
      if (c.get(Calendar.DAY_OF_MONTH) == cfer.get(Calendar.DAY_OF_MONTH) && c.get(Calendar.MONTH) == cfer.get(Calendar.MONTH)) {
        rtn=true;
      }
      return rtn;
    }
}

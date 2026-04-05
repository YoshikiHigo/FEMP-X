package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4382 {

    boolean method1(Date a,Date b){
      Calendar cal_a=Calendar.getInstance();
      Calendar cal_b=Calendar.getInstance();
      cal_a.setTime(a);
      cal_b.setTime(b);
      if (cal_a.get(Calendar.DATE) == cal_b.get(Calendar.DATE) && cal_a.get(Calendar.MONTH) == cal_b.get(Calendar.MONTH) && cal_a.get(Calendar.YEAR) == cal_b.get(Calendar.YEAR)) {
        return true;
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

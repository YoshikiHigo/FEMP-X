package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4335 {

    boolean method1(Date date1,Date date2){
      if (date1 == null || date2 == null) {
        return false;
      }
      return date1.getTime() == date2.getTime();
    }

    boolean method2(Date d1,Date d2){
      boolean answer=false;
      if (d1 == null || d2 == null) {
        return false;
      }
      Calendar calendar=Calendar.getInstance();
      calendar.setTime(d1);
      int month=calendar.get(Calendar.MONTH);
      int year=calendar.get(Calendar.YEAR);
      calendar.setTime(d2);
      answer=(month == calendar.get(Calendar.MONTH));
      answer=answer && (year == calendar.get(Calendar.YEAR));
      return answer;
    }
}

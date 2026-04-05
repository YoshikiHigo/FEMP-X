package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4342 {

    boolean method1(Date datum1,Date datum2){
      if (datum1 != null && datum2 != null) {
        final Calendar cal1=Calendar.getInstance();
        cal1.setTime(datum1);
        final Calendar cal2=Calendar.getInstance();
        cal2.setTime(datum2);
        return cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
      }
      return false;
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

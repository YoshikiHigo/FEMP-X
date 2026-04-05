package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4267 {

    boolean method1(Date date1,Date date2){
      if (date1 == null || date2 == null)   return false;
      Calendar cal=Calendar.getInstance();
      cal.setTime(date1);
      int year=cal.get(Calendar.YEAR);
      int month=cal.get(Calendar.MONTH);
      int day=cal.get(Calendar.DAY_OF_MONTH);
      cal.setTime(date2);
      return year == cal.get(Calendar.YEAR) && month == cal.get(Calendar.MONTH) && day == cal.get(Calendar.DAY_OF_MONTH);
    }

    boolean method2(Date date1,Date date2){
      if (date1 == null || date2 == null) {
        return false;
      }
      Calendar c1=Calendar.getInstance();
      c1.clear();
      c1.setTime(date1);
      Calendar c2=Calendar.getInstance();
      c2.clear();
      c2.setTime(date2);
      return c1.get(Calendar.DATE) == c2.get(Calendar.DATE) && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR);
    }
}

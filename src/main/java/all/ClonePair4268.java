package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4268 {

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

    boolean method2(Date datum1,Date datum2){
      if (datum1 != null && datum2 != null) {
        final Calendar cal1=Calendar.getInstance();
        cal1.setTime(datum1);
        final Calendar cal2=Calendar.getInstance();
        cal2.setTime(datum2);
        return cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
      }
      return false;
    }
}

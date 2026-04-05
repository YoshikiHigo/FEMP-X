package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4275 {

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
      return date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDate() == date2.getDate();
    }
}

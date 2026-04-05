package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4271 {

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

    boolean method2(Date one,Date two){
      if (one == null || two == null) {
        return false;
      }
      if (one.getYear() != two.getYear()) {
        return false;
      }
      if (one.getMonth() != two.getMonth()) {
        return false;
      }
      if (one.getDate() != two.getDate()) {
        return false;
      }
      return true;
    }
}

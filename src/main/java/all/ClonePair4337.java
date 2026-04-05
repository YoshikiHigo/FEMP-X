package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4337 {

    boolean method1(Date date1,Date date2){
      if (date1 == null || date2 == null) {
        return false;
      }
      return date1.getTime() == date2.getTime();
    }

    boolean method2(Date d1,Date d2){
      if (d1 == null || d2 == null)   return false;
      GregorianCalendar cal1=new GregorianCalendar();
      cal1.setTime(d1);
      GregorianCalendar cal2=new GregorianCalendar();
      cal2.setTime(d2);
      return (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR));
    }
}

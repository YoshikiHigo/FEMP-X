package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4308 {

    boolean method1(Date date1,Date date2){
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

    boolean method2(Date d1,Date d2){
      if (d1 == null || d2 == null)   return false;
      GregorianCalendar cal1=new GregorianCalendar();
      cal1.setTime(d1);
      GregorianCalendar cal2=new GregorianCalendar();
      cal2.setTime(d2);
      return (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR));
    }
}

package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4387 {

    boolean method1(Date d1,Date d2){
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

    boolean method2(Date d1,Date d2){
      if (d1 == null || d2 == null)   return false;
      GregorianCalendar cal1=new GregorianCalendar();
      cal1.setTime(d1);
      GregorianCalendar cal2=new GregorianCalendar();
      cal2.setTime(d2);
      return (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR));
    }
}

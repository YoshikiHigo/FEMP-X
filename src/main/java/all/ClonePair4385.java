package all;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ClonePair4385 {

    boolean method1(Date date1,Date date2){
      if ((date1 == null) || (date2 == null)) {
        return false;
      }
      Calendar cldr=Calendar.getInstance(Locale.ENGLISH);
      cldr.setTime(date1);
      cldr.set(Calendar.MILLISECOND,0);
      long dt1=cldr.getTimeInMillis();
      cldr.setTime(date2);
      cldr.set(Calendar.MILLISECOND,0);
      long dt2=cldr.getTimeInMillis();
      return dt1 == dt2;
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

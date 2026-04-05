package unverified;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ClonePair4318 {

    boolean method1(Date date1,Date date2){
      if (date1 == null || date2 == null) {
        return false;
      }
      if (date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDate() == date2.getDate()) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(Date date1,Date date2){
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
}

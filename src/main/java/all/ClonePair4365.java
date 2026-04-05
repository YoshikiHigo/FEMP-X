package all;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ClonePair4365 {

    boolean method1(Date one,Date two){
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

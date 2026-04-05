package all;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ClonePair4341 {

    boolean method1(Date datum1,Date datum2){
      if (datum1 != null && datum2 != null) {
        final Calendar cal1=Calendar.getInstance();
        cal1.setTime(datum1);
        final Calendar cal2=Calendar.getInstance();
        cal2.setTime(datum2);
        return cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
      }
      return false;
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

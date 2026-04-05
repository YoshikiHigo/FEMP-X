package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4338 {

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

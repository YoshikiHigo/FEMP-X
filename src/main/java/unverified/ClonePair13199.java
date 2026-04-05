package unverified;

import java.util.Calendar;

public class ClonePair13199 {

    boolean method1(Calendar c1,Calendar c2){
      if ((c1.get(Calendar.DATE) == c2.get(Calendar.DATE)) && (c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH)) && (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR))) {
        return true;
      }
     else   return false;
    }

    boolean method2(Calendar cal1,Calendar cal2){
      if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)) {
        if (cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)) {
          return true;
        }
      }
      return false;
    }
}

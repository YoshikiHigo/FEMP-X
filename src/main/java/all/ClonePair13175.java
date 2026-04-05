package all;

import java.util.Calendar;

public class ClonePair13175 {

    boolean method1(Calendar cal1,Calendar cal2){
      if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)) {
        return true;
      }
      return false;
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

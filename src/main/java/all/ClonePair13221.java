package all;

import java.util.Calendar;

public class ClonePair13221 {

    boolean method1(Calendar cal1,Calendar cal2){
      if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)) {
        if (cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(Calendar calDate,Calendar calDateTo){
      if (calDate.get(Calendar.YEAR) == calDateTo.get(Calendar.YEAR))   if (calDate.get(Calendar.MONTH) == calDateTo.get(Calendar.MONTH))   if (calDate.get(Calendar.DAY_OF_MONTH) == calDateTo.get(Calendar.DAY_OF_MONTH))   return true;
      return false;
    }
}

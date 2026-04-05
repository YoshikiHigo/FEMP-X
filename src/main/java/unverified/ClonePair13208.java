package unverified;

import java.util.Calendar;

public class ClonePair13208 {

    boolean method1(Calendar c1,Calendar c2){
      if ((c1.get(Calendar.DATE) == c2.get(Calendar.DATE)) && (c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH)) && (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR))) {
        return true;
      }
     else   return false;
    }

    boolean method2(Calendar calDate,Calendar calDateTo){
      if (calDate.get(Calendar.YEAR) == calDateTo.get(Calendar.YEAR))   if (calDate.get(Calendar.MONTH) == calDateTo.get(Calendar.MONTH))   if (calDate.get(Calendar.DAY_OF_MONTH) == calDateTo.get(Calendar.DAY_OF_MONTH))   return true;
      return false;
    }
}

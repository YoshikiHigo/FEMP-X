package all;

import java.util.Calendar;

public class ClonePair13170 {

    boolean method1(Calendar hora1,Calendar hora2){
      int h1=hora1.get(Calendar.HOUR_OF_DAY);
      int h2=hora2.get(Calendar.HOUR_OF_DAY);
      if (h1 != h2) {
        return false;
      }
      int m1=hora1.get(Calendar.MINUTE);
      int m2=hora2.get(Calendar.MINUTE);
      if (m1 != m2) {
        return false;
      }
      return true;
    }

    boolean method2(Calendar calDate,Calendar calDateTo){
      if (calDate.get(Calendar.YEAR) == calDateTo.get(Calendar.YEAR))   if (calDate.get(Calendar.MONTH) == calDateTo.get(Calendar.MONTH))   if (calDate.get(Calendar.DAY_OF_MONTH) == calDateTo.get(Calendar.DAY_OF_MONTH))   return true;
      return false;
    }
}

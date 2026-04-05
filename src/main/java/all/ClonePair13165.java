package all;

import java.util.Calendar;

public class ClonePair13165 {

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

    boolean method2(Calendar cal1,Calendar cal2){
      if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)) {
        return true;
      }
      return false;
    }
}

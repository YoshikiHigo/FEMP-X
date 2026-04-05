package all;

import java.util.Calendar;

public class ClonePair13164 {

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

    boolean method2(Calendar c1,Calendar c2){
      if ((c1.get(Calendar.DATE) == c2.get(Calendar.DATE)) && (c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH)) && (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR))) {
        return true;
      }
     else {
        return false;
      }
    }
}

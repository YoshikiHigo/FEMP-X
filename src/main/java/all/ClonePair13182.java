package all;

import java.util.Calendar;

public class ClonePair13182 {

    boolean method1(Calendar cal1,Calendar cal2){
      if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)) {
        return true;
      }
      return false;
    }

    boolean method2(Calendar c1,Calendar c2){
      if (c1.get(Calendar.DATE) == c2.get(Calendar.DATE) && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)) {
        return true;
      }
      return false;
    }
}

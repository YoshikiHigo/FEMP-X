package all;

import java.util.Calendar;

public class ClonePair13183 {

    boolean method1(Calendar c1,Calendar c2){
      if ((c1.get(Calendar.DATE) == c2.get(Calendar.DATE)) && (c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH)) && (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR))) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(Calendar c1,Calendar c2){
      if ((c1.get(Calendar.DATE) == c2.get(Calendar.DATE)) && (c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH)) && (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR))) {
        return true;
      }
     else   return false;
    }
}

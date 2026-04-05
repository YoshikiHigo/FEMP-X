package unverified;

import java.util.Date;

public class ClonePair4320 {

    boolean method1(Date source,Date target){
      boolean isEqual;
      if ((source == null && target != null) || (source != null && target == null) || (source != null && target != null && !source.equals(target))) {
        isEqual=false;
      }
     else {
        isEqual=true;
      }
      return isEqual;
    }

    boolean method2(Date date1,Date date2){
      if (date1 == null && date2 == null) {
        return true;
      }
     else   if (date1 == null || date2 == null) {
        return false;
      }
     else {
        return date1.getTime() == date2.getTime();
      }
    }
}

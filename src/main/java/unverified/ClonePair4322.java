package unverified;

import java.util.Date;

public class ClonePair4322 {

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

    boolean method2(Date d1,Date d2){
      if (d1 != null && d2 == null) {
        return false;
      }
      if (d1 == null && d2 != null) {
        return false;
      }
      if (d1 != null) {
        if (d2 == null) {
          return false;
        }
        return (d1.compareTo(d2) == 0);
      }
      return true;
    }
}

package unverified;

import java.util.Date;

public class ClonePair4321 {

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
      if (date1 == null) {
        if (date2 != null)     return false;
      }
     else {
        if (date2 == null)     return false;
        long getRidOfTime=1000 * 60 * 60* 24;
        long time1=date1.getTime() / getRidOfTime;
        long time2=date2.getTime() / getRidOfTime;
        if (time1 != time2)     return false;
      }
      return true;
    }
}

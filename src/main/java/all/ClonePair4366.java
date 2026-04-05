package all;

import java.util.Date;

public class ClonePair4366 {

    boolean method1(Date date1,Date date2){
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

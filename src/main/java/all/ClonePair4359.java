package all;

import java.util.Date;

public class ClonePair4359 {

    boolean method1(Date date1,Date date2){
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

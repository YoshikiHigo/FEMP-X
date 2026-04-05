package unverified;

import java.util.Date;

public class ClonePair4368 {

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

    boolean method2(Date a,Date b){
      if (a == null && b == null)   return true;
      if (a == null || b == null)   return false;
      return ((long)a.getTime() / 60000l) == ((long)b.getTime() / 60000l);
    }
}

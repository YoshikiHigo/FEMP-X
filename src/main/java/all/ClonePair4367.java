package all;

import java.util.Date;

public class ClonePair4367 {

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

    boolean method2(Date data1,Date data2){
      if (data1 == null && data2 == null)   return true;
      if ((data1 != null && data2 == null) || (data1 == null && data2 != null))   return false;
      return (data1.compareTo(data2) == 0);
    }
}

package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4345 {

    boolean method1(Date a,Date b){
      Calendar c=Calendar.getInstance();
      Calendar c2=Calendar.getInstance();
      c.setTime(a);
      c2.setTime(b);
      c.set(Calendar.MILLISECOND,0);
      c.set(Calendar.SECOND,0);
      c.set(Calendar.MINUTE,0);
      c.set(Calendar.HOUR,0);
      c2.set(Calendar.MILLISECOND,0);
      c2.set(Calendar.SECOND,0);
      c2.set(Calendar.MINUTE,0);
      c2.set(Calendar.HOUR,0);
      if (c2.get(Calendar.YEAR) == c.get(Calendar.YEAR)) {
        if (c2.get(Calendar.MONTH) == c.get(Calendar.MONTH)) {
          if (c2.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH)) {
            return true;
          }
        }
      }
      return false;
    }

    boolean method2(Date a,Date b){
      Calendar cal_a=Calendar.getInstance();
      Calendar cal_b=Calendar.getInstance();
      cal_a.setTime(a);
      cal_b.setTime(b);
      if (cal_a.get(Calendar.DATE) == cal_b.get(Calendar.DATE) && cal_a.get(Calendar.MONTH) == cal_b.get(Calendar.MONTH) && cal_a.get(Calendar.YEAR) == cal_b.get(Calendar.YEAR)) {
        return true;
      }
      return false;
    }
}

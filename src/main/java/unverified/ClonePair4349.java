package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4349 {

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

    boolean method2(Date d1,Date d2){
      boolean result=false;
      Calendar c1=Calendar.getInstance();
      c1.setTime(d1);
      Calendar c2=Calendar.getInstance();
      c2.setTime(d2);
      if (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR) && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH)) {
        result=true;
      }
      return result;
    }
}

package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4348 {

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

    boolean method2(Date date,Date feriado){
      boolean rtn=false;
      Calendar c=Calendar.getInstance();
      c.setTime(date);
      Calendar cfer=Calendar.getInstance();
      cfer.setTime(feriado);
      if (c.get(Calendar.DAY_OF_MONTH) == cfer.get(Calendar.DAY_OF_MONTH) && c.get(Calendar.MONTH) == cfer.get(Calendar.MONTH)) {
        rtn=true;
      }
      return rtn;
    }
}

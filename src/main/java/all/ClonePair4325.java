package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4325 {

    boolean method1(Date debut,Date fin){
      Calendar cal1=new GregorianCalendar();
      cal1.setTime(debut);
      int ddebut=cal1.get(Calendar.DAY_OF_YEAR);
      int yeardeb=cal1.get(Calendar.YEAR);
      cal1.setTime(fin);
      int dfin=cal1.get(Calendar.DAY_OF_YEAR);
      int yearfin=cal1.get(Calendar.YEAR);
      if (dfin == ddebut && yeardeb == yearfin) {
        return true;
      }
      return false;
    }

    boolean method2(Date a,Date b){
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
}

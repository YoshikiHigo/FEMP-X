package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4331 {

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

package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4328 {

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

    boolean method2(Date debut,Date fin){
      Calendar cal1=new GregorianCalendar();
      cal1.setTime(debut);
      int ddebut=cal1.get(Calendar.DAY_OF_YEAR);
      int yeardeb=cal1.get(Calendar.YEAR);
      cal1.setTime(fin);
      int dfin=cal1.get(Calendar.DAY_OF_YEAR);
      int yearfin=cal1.get(Calendar.YEAR);
      if (dfin >= ddebut && yeardeb == yearfin) {
        return true;
      }
      return false;
    }
}

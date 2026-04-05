package unverified;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4330 {

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

    boolean method2(Date date,Date comparedDate){
      Calendar calendar=Calendar.getInstance();
      calendar.setTime(date);
      Calendar comparedCalendar=Calendar.getInstance();
      comparedCalendar.setTime(comparedDate);
      if (calendar.get(Calendar.YEAR) == comparedCalendar.get(Calendar.YEAR) && calendar.get(Calendar.MONTH) == comparedCalendar.get(Calendar.MONTH) && calendar.get(Calendar.DATE) == comparedCalendar.get(Calendar.DATE)) {
        return true;
      }
     else {
        return false;
      }
    }
}

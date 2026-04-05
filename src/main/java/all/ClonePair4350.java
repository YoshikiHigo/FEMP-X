package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4350 {

    boolean method1(Date date1,Date date2){
      Calendar cal1=Calendar.getInstance();
      cal1.setTime(date1);
      Calendar cal2=Calendar.getInstance();
      cal2.setTime(date2);
      int month1=cal1.get(Calendar.MONTH);
      int month2=cal2.get(Calendar.MONTH);
      if (((month1 >= Calendar.JANUARY && month1 <= Calendar.MARCH) && (month2 >= Calendar.JANUARY && month2 <= Calendar.MARCH)) || ((month1 >= Calendar.APRIL && month1 <= Calendar.JUNE) && (month2 >= Calendar.APRIL && month2 <= Calendar.JUNE)) || ((month1 >= Calendar.JULY && month1 <= Calendar.SEPTEMBER) && (month2 >= Calendar.JULY && month2 <= Calendar.SEPTEMBER))|| ((month1 >= Calendar.OCTOBER && month1 <= Calendar.DECEMBER) && (month2 >= Calendar.OCTOBER && month2 <= Calendar.DECEMBER))) {
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

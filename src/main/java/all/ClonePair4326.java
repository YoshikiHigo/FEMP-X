package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4326 {

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

    boolean method2(Date date1,Date date2){
      Calendar cal1=Calendar.getInstance();
      Calendar cal2=Calendar.getInstance();
      cal1.setTime(date1);
      cal2.setTime(date2);
      int date1Year=cal1.get(Calendar.YEAR);
      int date1Month=cal1.get(Calendar.MONTH) + 1;
      int date1Day=cal1.get(Calendar.DATE);
      int date2Year=cal2.get(Calendar.YEAR);
      int date2Month=cal2.get(Calendar.MONTH) + 1;
      int date2Day=cal2.get(Calendar.DATE);
      if (date1Year == date2Year && date1Month == date2Month && date1Day == date2Day) {
        return true;
      }
      return false;
    }
}

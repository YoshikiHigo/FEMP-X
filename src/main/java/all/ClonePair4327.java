package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4327 {

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

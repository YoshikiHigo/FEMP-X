package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4377 {

    boolean method1(Date date1,Date date2){
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

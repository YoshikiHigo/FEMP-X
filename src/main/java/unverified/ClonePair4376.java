package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4376 {

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

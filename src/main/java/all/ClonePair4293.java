package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4293 {

    boolean method1(Date d1,Date d2){
      if (d1 == null || d2 == null)   return false;
      GregorianCalendar cal1=new GregorianCalendar();
      cal1.setTime(d1);
      GregorianCalendar cal2=new GregorianCalendar();
      cal2.setTime(d2);
      if (cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR))   if (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR))   return true;
      return false;
    }

    boolean method2(Date first,Date second){
      if (first == null || second == null) {
        return false;
      }
      if (first.equals(second)) {
        return true;
      }
      Calendar firstCal=new GregorianCalendar();
      firstCal.setTime(first);
      Calendar secondCal=new GregorianCalendar();
      secondCal.setTime(second);
      if (firstCal.get(Calendar.YEAR) == secondCal.get(Calendar.YEAR) && firstCal.get(Calendar.MONTH) == secondCal.get(Calendar.MONTH) && firstCal.get(Calendar.DAY_OF_MONTH) == secondCal.get(Calendar.DAY_OF_MONTH)) {
        return true;
      }
      return false;
    }
}

package all;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4272 {

    boolean method1(Date date1,Date date2){
      if (date1 == null || date2 == null)   return false;
      Calendar cal=Calendar.getInstance();
      cal.setTime(date1);
      int year=cal.get(Calendar.YEAR);
      int month=cal.get(Calendar.MONTH);
      int day=cal.get(Calendar.DAY_OF_MONTH);
      cal.setTime(date2);
      return year == cal.get(Calendar.YEAR) && month == cal.get(Calendar.MONTH) && day == cal.get(Calendar.DAY_OF_MONTH);
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

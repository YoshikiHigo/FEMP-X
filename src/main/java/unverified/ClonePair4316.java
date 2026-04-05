package unverified;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4316 {

    boolean method1(Date date1,Date date2){
      if (date1 == null || date2 == null) {
        return false;
      }
      if (date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDate() == date2.getDate()) {
        return true;
      }
     else {
        return false;
      }
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

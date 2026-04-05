package unverified;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair4363 {

    boolean method1(Date one,Date two){
      if (one == null || two == null) {
        return false;
      }
      if (one.getYear() != two.getYear()) {
        return false;
      }
      if (one.getMonth() != two.getMonth()) {
        return false;
      }
      if (one.getDate() != two.getDate()) {
        return false;
      }
      return true;
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

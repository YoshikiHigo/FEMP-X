package unverified;

import java.util.Calendar;

public class ClonePair13151 {

    boolean method1(Calendar _cal1,Calendar _cal2){
      if (_cal1 != null && _cal2 != null) {
        int year1=_cal1.get(Calendar.YEAR);
        int month1=_cal1.get(Calendar.MONTH);
        int day1=_cal1.get(Calendar.DAY_OF_MONTH);
        int year2=_cal2.get(Calendar.YEAR);
        int month2=_cal2.get(Calendar.MONTH);
        int day2=_cal2.get(Calendar.DAY_OF_MONTH);
        return year1 == year2 && month1 == month2 && day1 == day2;
      }
      return false;
    }

    boolean method2(Calendar date1,Calendar date2){
      if (date1 == null || date2 == null) {
        return false;
      }
      if (date1.get(Calendar.YEAR) != date2.get(Calendar.YEAR)) {
        return false;
      }
      if (date1.get(Calendar.MONTH) != date2.get(Calendar.MONTH)) {
        return false;
      }
      if (date1.get(Calendar.DAY_OF_MONTH) != date2.get(Calendar.DAY_OF_MONTH)) {
        return false;
      }
      return true;
    }
}

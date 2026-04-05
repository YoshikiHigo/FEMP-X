package all;

import java.util.Date;

public class ClonePair4360 {

    boolean method1(Date date1,Date date2){
      if (date1 == null && date2 == null) {
        return true;
      }
     else   if (date1 == null || date2 == null) {
        return false;
      }
     else {
        return date1.getTime() == date2.getTime();
      }
    }

    boolean method2(Date d1,Date d2){
      if (d1 != null && d2 == null) {
        return false;
      }
      if (d1 == null && d2 != null) {
        return false;
      }
      if (d1 != null) {
        if (d2 == null) {
          return false;
        }
        return (d1.compareTo(d2) == 0);
      }
      return true;
    }
}

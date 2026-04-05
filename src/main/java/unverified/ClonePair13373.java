package unverified;

import java.util.Date;

public class ClonePair13373 {

    Date method1(Date date1,Date date2){
      if (date1 == null || date2 == null) {
        return null;
      }
      return date1.compareTo(date2) > 0 ? date1 : date2;
    }

    Date method2(Date date1,Date date2){
      if (date1 == null || date2 == null) {
        return null;
      }
      if (date1.getTime() > date2.getTime()) {
        return date1;
      }
      return date2;
    }
}

package unverified;

import java.util.Date;

public class ClonePair13365 {

    Date method1(Date a,Date b){
      if (a == null || b == null)   return null;
      if (a.compareTo(b) > 0)   return a;
      return b;
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

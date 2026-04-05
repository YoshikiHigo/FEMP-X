package all;

import java.util.Date;

public class ClonePair4371 {

    boolean method1(Date d1,Date d2){
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

    boolean method2(Date a,Date b){
      if (a == null && b == null)   return true;
      if (a == null || b == null)   return false;
      return ((long)a.getTime() / 60000l) == ((long)b.getTime() / 60000l);
    }
}

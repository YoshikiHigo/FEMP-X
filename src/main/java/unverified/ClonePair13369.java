package unverified;

import java.util.Date;

public class ClonePair13369 {

    Date method1(Date d1,Date d2){
      if (d1 == null && d2 == null)   return null;
      if (d1 == null)   return d2;
      if (d2 == null)   return d1;
      return (d1.before(d2)) ? d1 : d2;
    }

    Date method2(Date a,Date b){
      if (a == null)   return b;
      if (b == null)   return a;
      if (a.compareTo(b) < 0)   return a;
      return b;
    }
}

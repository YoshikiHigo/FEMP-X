package all;

import java.util.Date;

public class ClonePair13366 {

    Date method1(Date a,Date b){
      if (a == null)   return b;
      if (b == null)   return a;
      if (a.compareTo(b) > 0)   return a;
      return b;
    }

    Date method2(Date d1,Date d2){
      if (d1 == null && d2 == null)   return null;
      if (d1 == null)   return d2;
      if (d2 == null)   return d1;
      return (d1.after(d2)) ? d1 : d2;
    }
}

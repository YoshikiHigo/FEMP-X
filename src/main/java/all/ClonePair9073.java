package all;

import java.util.*;

public class ClonePair9073 {

    int method1(Date d1,Date d2){
      if (d1 == null && d2 == null)   return 0;
     else   if (d1 == null)   return 1;
     else   if (d2 == null)   return -1;
      if (d1.getTime() > d2.getTime())   return 1;
     else   if (d1.getTime() < d2.getTime())   return -1;
     else   return 0;
    }

    int method2(Date a,Date b){
      if (a == null) {
        return b != null ? 1 : 0;
      }
      if (b == null) {
        return a != null ? -1 : 0;
      }
      Calendar ca=GregorianCalendar.getInstance();
      ca.setTime(a);
      ca.set(Calendar.HOUR_OF_DAY,0);
      ca.set(Calendar.MINUTE,0);
      ca.set(Calendar.SECOND,0);
      ca.set(Calendar.MILLISECOND,0);
      Calendar cb=GregorianCalendar.getInstance();
      cb.setTime(b);
      cb.set(Calendar.HOUR_OF_DAY,0);
      cb.set(Calendar.MINUTE,0);
      cb.set(Calendar.SECOND,0);
      cb.set(Calendar.MILLISECOND,0);
      long timea=ca.getTimeInMillis();
      long timeb=cb.getTimeInMillis();
      if (timea < timeb) {
        return -1;
      }
      if (timeb < timea) {
        return 1;
      }
      return 0;
    }
}

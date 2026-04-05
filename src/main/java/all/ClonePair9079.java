package all;

import java.util.*;

public class ClonePair9079 {

    int method1(Date a,Date b){
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

    int method2(Date d1,Date d2){
      int result;
      if (d1 == null || d2 == null) {
        result=(d1 == d2 ? 0 : (d1 == null ? 1 : -1));
      }
     else {
        long diff=d1.getTime() - d2.getTime();
        result=((diff == 0) ? 0 : ((diff > 0) ? 1 : -1));
      }
      return (result);
    }
}

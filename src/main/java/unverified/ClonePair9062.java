package unverified;

import java.util.*;

public class ClonePair9062 {

    int method1(Date date,Date date2){
      if ((date != null) && (date2 == null)) {
        return -1;
      }
     else   if ((date == null) && (date2 != null)) {
        return 1;
      }
     else   if ((date == null) && (date2 == null)) {
        return 0;
      }
      long time=date.getTime();
      long time2=date2.getTime();
      if (time == time2) {
        return 0;
      }
     else   if (time < time2) {
        return -1;
      }
     else {
        return 1;
      }
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

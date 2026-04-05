package unverified;

import java.util.*;

public class ClonePair9074 {

    int method1(Date d1,Date d2){
      if (d1 == null && d2 == null)   return 0;
     else   if (d1 == null)   return 1;
     else   if (d2 == null)   return -1;
      if (d1.getTime() > d2.getTime())   return 1;
     else   if (d1.getTime() < d2.getTime())   return -1;
     else   return 0;
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

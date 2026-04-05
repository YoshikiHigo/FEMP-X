package unverified;

import java.util.Date;

public class ClonePair13372 {

    Date method1(Date date1,Date date2){
      if (date1 == null)   return date2;
     else   if (date2 == null)   return date1;
     else   if (date1.getTime() > date2.getTime())   return date2;
     else   if (date1.getTime() < date2.getTime())   return date1;
     else   return date1;
    }

    Date method2(Date a,Date b){
      if (a == null)   return b;
      if (b == null)   return a;
      if (a.compareTo(b) < 0)   return a;
      return b;
    }
}

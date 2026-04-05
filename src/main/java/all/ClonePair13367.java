package all;

import java.util.Date;

public class ClonePair13367 {

    Date method1(Date d1,Date d2){
      if (d1 == null && d2 == null)   return null;
      if (d1 == null)   return d2;
      if (d2 == null)   return d1;
      return (d1.before(d2)) ? d1 : d2;
    }

    Date method2(Date date1,Date date2){
      if (date1 == null)   return date2;
     else   if (date2 == null)   return date1;
     else   if (date1.getTime() > date2.getTime())   return date2;
     else   if (date1.getTime() < date2.getTime())   return date1;
     else   return date1;
    }
}

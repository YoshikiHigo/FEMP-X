package all;

import java.util.*;

public class ClonePair9468 {

    String method1(Calendar cal){
      if (cal.get(Calendar.DATE) < 10)   return "0" + Integer.toString(cal.get(Calendar.DATE));
     else   return Integer.toString(cal.get(Calendar.DATE));
    }

    String method2(Calendar aCalendar){
      String dateStamp="";
      int days=aCalendar.get(Calendar.DAY_OF_MONTH);
      if (days < 10) {
        dateStamp+="0" + days;
      }
     else {
        dateStamp+=days;
      }
      return dateStamp;
    }
}

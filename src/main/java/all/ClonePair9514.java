package all;

import java.util.*;

public class ClonePair9514 {

    String method1(Calendar aCalendar){
      String dateStamp="";
      int months=aCalendar.get(Calendar.MONTH) + 1;
      if (months < 10) {
        dateStamp+="0" + months;
      }
     else {
        dateStamp+=months;
      }
      return dateStamp;
    }

    String method2(Calendar c){
      int mois=c.get(Calendar.MONTH) + 1;
      if (mois < 10) {
        return "0" + mois;
      }
     else {
        return "" + mois;
      }
    }
}

package unverified;

import java.util.*;

public class ClonePair6814 {

    boolean method1(Date aDate){
      Calendar aCal1=Calendar.getInstance();
      aCal1.setTime(aDate);
      Date date1=new Date();
      Calendar aCal2=Calendar.getInstance();
      aCal2.setTime(date1);
      if ((aCal1.get(Calendar.DATE) == aCal2.get(Calendar.DATE)) && (aCal1.get(Calendar.YEAR) == aCal2.get(Calendar.YEAR)) && (aCal1.get(Calendar.MONTH) == aCal2.get(Calendar.MONTH))) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(Date date){
      Calendar today=Calendar.getInstance();
      today.setTime(new Date());
      Calendar day=Calendar.getInstance();
      day.setTime(date);
      if (today.get(Calendar.YEAR) == day.get(Calendar.YEAR) && today.get(Calendar.MONTH) == day.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) == day.get(Calendar.DAY_OF_MONTH))   return true;
     else   return false;
    }
}

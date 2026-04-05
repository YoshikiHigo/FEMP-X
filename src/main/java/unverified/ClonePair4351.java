package unverified;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4351 {

    boolean method1(Date date1,Date date2){
      Calendar cal1=Calendar.getInstance();
      cal1.setTime(date1);
      Calendar cal2=Calendar.getInstance();
      cal2.setTime(date2);
      int month1=cal1.get(Calendar.MONTH);
      int month2=cal2.get(Calendar.MONTH);
      if (((month1 >= Calendar.JANUARY && month1 <= Calendar.MARCH) && (month2 >= Calendar.JANUARY && month2 <= Calendar.MARCH)) || ((month1 >= Calendar.APRIL && month1 <= Calendar.JUNE) && (month2 >= Calendar.APRIL && month2 <= Calendar.JUNE)) || ((month1 >= Calendar.JULY && month1 <= Calendar.SEPTEMBER) && (month2 >= Calendar.JULY && month2 <= Calendar.SEPTEMBER))|| ((month1 >= Calendar.OCTOBER && month1 <= Calendar.DECEMBER) && (month2 >= Calendar.OCTOBER && month2 <= Calendar.DECEMBER))) {
        return true;
      }
      return false;
    }

    boolean method2(Date date,Date feriado){
      boolean rtn=false;
      Calendar c=Calendar.getInstance();
      c.setTime(date);
      Calendar cfer=Calendar.getInstance();
      cfer.setTime(feriado);
      if (c.get(Calendar.DAY_OF_MONTH) == cfer.get(Calendar.DAY_OF_MONTH) && c.get(Calendar.MONTH) == cfer.get(Calendar.MONTH)) {
        rtn=true;
      }
      return rtn;
    }
}

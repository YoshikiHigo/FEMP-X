package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4394 {

    boolean method1(Date date,Date feriado){
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

    boolean method2(Date d1,Date d2){
      boolean result=false;
      Calendar c1=Calendar.getInstance();
      c1.setTime(d1);
      Calendar c2=Calendar.getInstance();
      c2.setTime(d2);
      if (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR) && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH)) {
        result=true;
      }
      return result;
    }
}

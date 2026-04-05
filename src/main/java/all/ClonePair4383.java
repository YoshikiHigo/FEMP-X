package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4383 {

    boolean method1(Date a,Date b){
      Calendar cal_a=Calendar.getInstance();
      Calendar cal_b=Calendar.getInstance();
      cal_a.setTime(a);
      cal_b.setTime(b);
      if (cal_a.get(Calendar.DATE) == cal_b.get(Calendar.DATE) && cal_a.get(Calendar.MONTH) == cal_b.get(Calendar.MONTH) && cal_a.get(Calendar.YEAR) == cal_b.get(Calendar.YEAR)) {
        return true;
      }
      return false;
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

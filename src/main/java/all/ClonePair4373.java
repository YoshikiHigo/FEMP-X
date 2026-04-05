package all;

import java.util.Calendar;
import java.util.Date;

public class ClonePair4373 {

    boolean method1(Date date1,Date date2){
      Calendar cal1=Calendar.getInstance();
      Calendar cal2=Calendar.getInstance();
      cal1.setTime(date1);
      cal2.setTime(date2);
      int date1Year=cal1.get(Calendar.YEAR);
      int date1Month=cal1.get(Calendar.MONTH) + 1;
      int date1Day=cal1.get(Calendar.DATE);
      int date2Year=cal2.get(Calendar.YEAR);
      int date2Month=cal2.get(Calendar.MONTH) + 1;
      int date2Day=cal2.get(Calendar.DATE);
      if (date1Year == date2Year && date1Month == date2Month && date1Day == date2Day) {
        return true;
      }
      return false;
    }

    @SuppressWarnings("unused") boolean method2(Date date1,Date date2){
      Calendar cal1=Calendar.getInstance();
      Calendar cal2=Calendar.getInstance();
      cal1.setTime(date1);
      cal2.setTime(date2);
      int date1Year=cal1.get(Calendar.YEAR);
      int date1Month=cal1.get(Calendar.MONTH) + 1;
      int date1Day=cal1.get(Calendar.DATE);
      int date2Year=cal2.get(Calendar.YEAR);
      int date2Month=cal2.get(Calendar.MONTH) + 1;
      int date2Day=cal2.get(Calendar.DATE);
      if (date1Year == date2Year && date1Month == date2Month && date1Day == date2Day) {
        return true;
      }
      return false;
    }
}

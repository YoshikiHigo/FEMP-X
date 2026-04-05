package all;

import java.util.*;

public class ClonePair9048 {

    int method1(Date date1,Date date2){
      Calendar cal1=Calendar.getInstance();
      Calendar cal2=Calendar.getInstance();
      cal1.setTime(date1);
      cal2.setTime(date2);
      int date1Year=cal1.get(Calendar.YEAR);
      int date1Month=cal1.get(Calendar.MONTH) + 1;
      int date1Day=cal1.get(Calendar.DATE);
      int date1Hour=cal1.get(Calendar.HOUR);
      int date1Minute=cal1.get(Calendar.MINUTE);
      int date1Second=cal1.get(Calendar.SECOND);
      int date2Year=cal2.get(Calendar.YEAR);
      int date2Month=cal2.get(Calendar.MONTH) + 1;
      int date2Day=cal2.get(Calendar.DATE);
      int date2Hour=cal2.get(Calendar.HOUR);
      int date2Minute=cal2.get(Calendar.MINUTE);
      int date2Second=cal2.get(Calendar.SECOND);
      if (date1Year == date2Year && date1Month == date2Month && date1Day == date2Day && date1Hour == date2Hour && date1Minute == date2Minute && date1Second == date2Second) {
        return 0;
      }
      if (cal1.after(cal2)) {
        return 2;
      }
     else {
        return 1;
      }
    }

    @SuppressWarnings("unused") int method2(Date date1,Date date2){
      Calendar cal1=Calendar.getInstance();
      Calendar cal2=Calendar.getInstance();
      cal1.setTime(date1);
      cal2.setTime(date2);
      int date1Year=cal1.get(Calendar.YEAR);
      int date1Month=cal1.get(Calendar.MONTH) + 1;
      int date1Day=cal1.get(Calendar.DATE);
      int date1Hour=cal1.get(Calendar.HOUR);
      int date1Minute=cal1.get(Calendar.MINUTE);
      int date1Second=cal1.get(Calendar.SECOND);
      int date2Year=cal2.get(Calendar.YEAR);
      int date2Month=cal2.get(Calendar.MONTH) + 1;
      int date2Day=cal2.get(Calendar.DATE);
      int date2Hour=cal2.get(Calendar.HOUR);
      int date2Minute=cal2.get(Calendar.MINUTE);
      int date2Second=cal2.get(Calendar.SECOND);
      if (date1Year == date2Year && date1Month == date2Month && date1Day == date2Day && date1Hour == date2Hour && date1Minute == date2Minute && date1Second == date2Second) {
        return 0;
      }
      if (cal1.after(cal2)) {
        return 2;
      }
     else {
        return 1;
      }
    }
}

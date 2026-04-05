package all;

import java.util.Date;

public class ClonePair4334 {

    boolean method1(Date date1,Date date2){
      if (date1 == null || date2 == null) {
        return false;
      }
      return date1.getTime() == date2.getTime();
    }

    boolean method2(Date date1,Date date2){
      if (date1 == null || date2 == null) {
        return false;
      }
      return date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDate() == date2.getDate();
    }
}

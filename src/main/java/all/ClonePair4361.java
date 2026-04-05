package all;

import java.util.Date;

public class ClonePair4361 {

    boolean method1(Date date1,Date date2){
      if (date1 == null && date2 == null) {
        return true;
      }
     else   if (date1 == null || date2 == null) {
        return false;
      }
     else {
        return date1.getTime() == date2.getTime();
      }
    }

    boolean method2(Date data1,Date data2){
      if (data1 == null && data2 == null)   return true;
      if ((data1 != null && data2 == null) || (data1 == null && data2 != null))   return false;
      return (data1.compareTo(data2) == 0);
    }
}

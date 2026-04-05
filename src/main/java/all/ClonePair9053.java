package all;

import java.util.*;

public class ClonePair9053 {

    int method1(Date date1,Date date2){
      if (date1 == null && date2 == null)   return 0;
     else   if (date1 == null)   return 1;
     else   if (date2 == null)   return -1;
      if ((date1 != null ? date1.getTime() : 0) > (date2 != null ? date2.getTime() : 0))   return -1;
     else   if ((date1 != null ? date1.getTime() : 0) < (date2 != null ? date2.getTime() : 0))   return 1;
     else   return 0;
    }

    int method2(Date date,Date compareWithDate){
      if ((date != null) && (compareWithDate == null)) {
        return -1;
      }
     else   if ((date == null) && (compareWithDate != null)) {
        return 1;
      }
     else   if (date == compareWithDate) {
        return 0;
      }
     else {
        return -date.compareTo(compareWithDate);
      }
    }
}

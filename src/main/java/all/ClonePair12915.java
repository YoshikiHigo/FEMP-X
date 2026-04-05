package all;

import java.util.Date;

public class ClonePair12915 {

    boolean method1(Date date,Date start,Date end){
      boolean ret=true;
      if (start != null && date.before(start)) {
        ret=false;
      }
      if (ret && end != null && date.after(end)) {
        ret=false;
      }
      return ret;
    }

    boolean method2(Date callStartDate,Date sinceDate,Date untilDate){
      if (sinceDate != null)   if (callStartDate.before(sinceDate))   return false;
      if (untilDate != null)   if (callStartDate.after(untilDate))   return false;
      return true;
    }
}

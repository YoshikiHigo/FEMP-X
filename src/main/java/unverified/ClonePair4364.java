package unverified;

import java.util.Date;

public class ClonePair4364 {

    boolean method1(Date one,Date two){
      if (one == null || two == null) {
        return false;
      }
      if (one.getYear() != two.getYear()) {
        return false;
      }
      if (one.getMonth() != two.getMonth()) {
        return false;
      }
      if (one.getDate() != two.getDate()) {
        return false;
      }
      return true;
    }

    boolean method2(Date date1,Date date2){
      if (date1 == null || date2 == null) {
        return false;
      }
      return date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDate() == date2.getDate();
    }
}

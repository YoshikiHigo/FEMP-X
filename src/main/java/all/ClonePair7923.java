package all;

import java.util.*;

public class ClonePair7923 {

    boolean method1(Calendar dateToCheck){
      int dayOfWeek=dateToCheck.get(Calendar.DAY_OF_WEEK);
      if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
        return true;
      }
      return false;
    }

    boolean method2(Calendar date){
      if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
        return true;
      }
      return false;
    }
}

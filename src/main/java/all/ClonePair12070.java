package all;

import java.util.*;

public class ClonePair12070 {

    String method1(int day){
      if (day == Calendar.MONDAY)   return "MONDAY";
     else   if (day == Calendar.TUESDAY)   return "TUESDAY";
     else   if (day == Calendar.WEDNESDAY)   return "WEDNESDAY";
     else   if (day == Calendar.THURSDAY)   return "THURSDAY";
     else   if (day == Calendar.FRIDAY)   return "FRIDAY";
     else   if (day == Calendar.SATURDAY)   return "SATURDAY";
     else   if (day == Calendar.SUNDAY)   return "SUNDAY";
     else   return null;
    }

    String method2(int num){
      String retval=null;
    switch (num) {
    case Calendar.SUNDAY:    retval="SUNDAY";
      break;
    case Calendar.MONDAY:retval="MONDAY";
    break;
    case Calendar.TUESDAY:retval="TUESDAY";
    break;
    case Calendar.WEDNESDAY:retval="WEDNESDAY";
    break;
    case Calendar.THURSDAY:retval="THURSDAY";
    break;
    case Calendar.FRIDAY:retval="FRIDAY";
    break;
    case Calendar.SATURDAY:retval="SATURDAY";
    break;
    }
    return retval;
    }
}

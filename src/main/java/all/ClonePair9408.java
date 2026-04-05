package all;

import java.util.*;

public class ClonePair9408 {

    String method1(Calendar cal){
      String month=null;
      if (cal.get(Calendar.MONTH) == Calendar.JANUARY)   month="Jan";
     else   if (cal.get(Calendar.MONTH) == Calendar.FEBRUARY)   month="Feb";
     else   if (cal.get(Calendar.MONTH) == Calendar.MARCH)   month="Mar";
     else   if (cal.get(Calendar.MONTH) == Calendar.APRIL)   month="Apr";
     else   if (cal.get(Calendar.MONTH) == Calendar.MAY)   month="May";
     else   if (cal.get(Calendar.MONTH) == Calendar.JUNE)   month="Jun";
     else   if (cal.get(Calendar.MONTH) == Calendar.JULY)   month="Jul";
     else   if (cal.get(Calendar.MONTH) == Calendar.AUGUST)   month="Aug";
     else   if (cal.get(Calendar.MONTH) == Calendar.SEPTEMBER)   month="Sep";
     else   if (cal.get(Calendar.MONTH) == Calendar.OCTOBER)   month="Oct";
     else   if (cal.get(Calendar.MONTH) == Calendar.NOVEMBER)   month="Nov";
     else   month="Dec";
      return month;
    }

    String method2(Calendar d){
      String month="";
    switch (d.get(Calendar.MONTH)) {
    case 0:    month="Jan";
      break;
    case 1:month="Feb";
    break;
    case 2:month="Mar";
    break;
    case 3:month="Apr";
    break;
    case 4:month="May";
    break;
    case 5:month="Jun";
    break;
    case 6:month="Jul";
    break;
    case 7:month="Aug";
    break;
    case 8:month="Sep";
    break;
    case 9:month="Oct";
    break;
    case 10:month="Nov";
    break;
    case 11:month="Dec";
    break;
    }
    return month;
    }
}

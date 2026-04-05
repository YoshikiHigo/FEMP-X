package all;

import java.util.*;

public class ClonePair9568 {

    String method1(Calendar calendar){
      int year=calendar.get(Calendar.YEAR);
      int month=calendar.get(Calendar.MONTH) + 1;
      int day=calendar.get(Calendar.DAY_OF_MONTH);
      StringBuffer sb=new StringBuffer();
      if (year < 1000) {
        sb.append('0');
        if (year < 100) {
          sb.append('0');
          if (year < 10) {
            sb.append('0');
          }
        }
      }
      sb.append(Integer.toString(year));
      sb.append('-');
      if (month < 10) {
        sb.append('0');
      }
      sb.append(Integer.toString(month));
      sb.append('-');
      if (day < 10) {
        sb.append('0');
      }
      sb.append(Integer.toString(day));
      return sb.toString();
    }

    String method2(Calendar date){
      StringBuffer sb=new StringBuffer();
      int year=date.get(Calendar.YEAR);
      for (int i=0; i < 4 - String.valueOf(year).length(); i++)   sb.append('0');
      sb.append(year).append('-');
      int month=date.get(Calendar.MONTH) + 1;
      if (month < 10)   sb.append('0');
      sb.append(month).append('-');
      int day=date.get(Calendar.DAY_OF_MONTH);
      if (day < 10)   sb.append('0');
      sb.append(day);
      return sb.toString();
    }
}

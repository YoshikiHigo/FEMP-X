package all;

import java.util.*;

public class ClonePair9551 {

    String method1(Calendar c){
      int i=(c.get(Calendar.MONTH) + 1);
      String m;
      String d;
      if (i < 10) {
        m="0" + i;
      }
     else {
        m="" + i;
      }
      String y="" + c.get(Calendar.YEAR);
      i=c.get(Calendar.DATE);
      if (i < 10) {
        d="0" + i;
      }
     else {
        d="" + i;
      }
      return y + "-" + m+ "-"+ d;
    }

    String method2(Calendar cal){
      String t;
      String month;
      String year;
      String day;
      year="" + cal.get(Calendar.YEAR);
      if ((cal.get(Calendar.MONTH) + 1) <= 9) {
        month="0" + (cal.get(Calendar.MONTH) + 1);
      }
     else {
        month="" + (cal.get(Calendar.MONTH) + 1);
      }
      if (cal.get(Calendar.DAY_OF_MONTH) <= 9) {
        day="0" + cal.get(Calendar.DAY_OF_MONTH);
      }
     else {
        day="" + cal.get(Calendar.DAY_OF_MONTH);
      }
      t=year + "-" + month+ "-"+ day;
      return t;
    }
}

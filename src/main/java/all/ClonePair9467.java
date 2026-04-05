package all;

import java.util.*;

public class ClonePair9467 {

    String method1(Calendar calend){
      String current;
      current=calend.get(Calendar.YEAR) + "-";
      if (calend.get(Calendar.MONTH) < 9)   current=current + "0";
      current=current + (calend.get(Calendar.MONTH) + 1) + "-";
      if (calend.get(Calendar.DAY_OF_MONTH) < 10)   current=current + "0";
      current=current + calend.get(Calendar.DAY_OF_MONTH);
      return current;
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

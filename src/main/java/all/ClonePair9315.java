package all;

import java.util.*;

public class ClonePair9315 {

    String method1(GregorianCalendar c){
      int day=c.get(Calendar.DAY_OF_MONTH);
      int month=c.get(Calendar.MONTH) + 1;
      int year=c.get(Calendar.YEAR);
      String prefixDay="";
      String prefixMonth="";
      if (day < 10)   prefixDay="0";
      if (month < 10)   prefixMonth="0";
      return year + "-" + prefixMonth+ month+ "-"+ prefixDay+ day;
    }

    String method2(GregorianCalendar gc){
      String day="";
      if (gc.get(Calendar.DAY_OF_MONTH) < 10)   day="0" + (gc.get(Calendar.DAY_OF_MONTH));
     else   day+=(gc.get(Calendar.DAY_OF_MONTH));
      String month="";
      if (gc.get(Calendar.MONTH) + 1 < 10)   month="0" + (gc.get(Calendar.MONTH) + 1);
     else   month+=(gc.get(Calendar.MONTH) + 1);
      return gc.get(Calendar.YEAR) + "-" + month+ "-"+ day;
    }
}

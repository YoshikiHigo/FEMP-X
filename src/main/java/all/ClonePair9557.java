package all;

import java.util.*;

public class ClonePair9557 {

    String method1(Calendar date){
      String dateString="" + date.get(Calendar.YEAR) + "-";
      int month=date.get(Calendar.MONTH) + 1;
      if (month < 10)   dateString+="0";
      dateString+=month + "-";
      int day=date.get(Calendar.DAY_OF_MONTH);
      if (day < 10)   dateString+="0";
      dateString+=day;
      return dateString;
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
